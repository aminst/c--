.class public ProductCatalog
.super java/lang/Object
.field id Ljava/lang/Integer;
.field price Ljava/lang/Integer;
.method public <init>()V
.limit stack 128
.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		aload_0
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield ProductCatalog/price Ljava/lang/Integer;
		aload_0
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield ProductCatalog/id Ljava/lang/Integer;
		return
.end method
