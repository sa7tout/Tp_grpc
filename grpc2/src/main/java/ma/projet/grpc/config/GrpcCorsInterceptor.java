package ma.projet.grpc.config;

import io.grpc.*;
import net.devh.boot.grpc.server.interceptor.GrpcGlobalServerInterceptor;
import org.springframework.stereotype.Component;

@Component
@GrpcGlobalServerInterceptor
public class GrpcCorsInterceptor implements ServerInterceptor {

    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
            ServerCall<ReqT, RespT> call,
            Metadata headers,
            ServerCallHandler<ReqT, RespT> next) {

        // Allow CORS by setting appropriate headers
        ServerCall<ReqT, RespT> serverCall = new ForwardingServerCall.SimpleForwardingServerCall<>(call) {
            @Override
            public void sendHeaders(Metadata headers) {
                headers.put(Metadata.Key.of("access-control-allow-origin", Metadata.ASCII_STRING_MARSHALLER), "*");
                headers.put(Metadata.Key.of("access-control-allow-methods", Metadata.ASCII_STRING_MARSHALLER), "POST, GET, OPTIONS, DELETE");
                headers.put(Metadata.Key.of("access-control-allow-headers", Metadata.ASCII_STRING_MARSHALLER), "Content-Type, Accept, X-Requested-With, remember-me");
                super.sendHeaders(headers);
            }
        };

        return next.startCall(serverCall, headers);
    }
}
