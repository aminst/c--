.class public Order
.super java/lang/Object
.field quantity Ljava/lang/Integer;
.field product LProductCatalog;
.method public <init>()V
.limit stack 128
.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		aload_0
		new ProductCatalog
		dup
		invokespecial ProductCatalog/<init>()V
		putfield Order/product LProductCatalog;
		aload_0
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Order/quantity Ljava/lang/Integer;
		return
.end method
