// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compte.proto

package ma.projet.grpc.stubs;

public final class CompteServiceProto {
  private CompteServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Compte_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Compte_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllComptesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllComptesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAllComptesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAllComptesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveCompteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveCompteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SaveCompteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SaveCompteResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014compte.proto\"T\n\006Compte\022\n\n\002id\030\001 \001(\t\022\r\n\005" +
      "solde\030\002 \001(\002\022\024\n\014dateCreation\030\003 \001(\t\022\031\n\004typ" +
      "e\030\004 \001(\0162\013.TypeCompte\"\026\n\024GetAllComptesReq" +
      "uest\"1\n\025GetAllComptesResponse\022\030\n\007comptes" +
      "\030\001 \003(\0132\007.Compte\",\n\021SaveCompteRequest\022\027\n\006" +
      "compte\030\001 \001(\0132\007.Compte\"-\n\022SaveCompteRespo" +
      "nse\022\027\n\006compte\030\001 \001(\0132\007.Compte*\'\n\nTypeComp" +
      "te\022\013\n\007SAVINGS\020\000\022\014\n\010CHECKING\020\0012\203\001\n\rCompte" +
      "Service\022;\n\nallComptes\022\025.GetAllComptesReq" +
      "uest\032\026.GetAllComptesResponse\0225\n\nsaveComp" +
      "te\022\022.SaveCompteRequest\032\023.SaveCompteRespo" +
      "nseB,\n\024ma.projet.grpc.stubsB\022CompteServi" +
      "ceProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Compte_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Compte_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Compte_descriptor,
        new java.lang.String[] { "Id", "Solde", "DateCreation", "Type", });
    internal_static_GetAllComptesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GetAllComptesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllComptesRequest_descriptor,
        new java.lang.String[] { });
    internal_static_GetAllComptesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GetAllComptesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAllComptesResponse_descriptor,
        new java.lang.String[] { "Comptes", });
    internal_static_SaveCompteRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SaveCompteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveCompteRequest_descriptor,
        new java.lang.String[] { "Compte", });
    internal_static_SaveCompteResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_SaveCompteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SaveCompteResponse_descriptor,
        new java.lang.String[] { "Compte", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}