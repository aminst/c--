.class public Main
.super java/lang/Object
.method public <init>()V
.limit stack 128
.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		return
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
.end method
.method public createOrder(LProductCatalog;Ljava/lang/Integer;)LOrder;
.limit stack 128
.limit locals 128
		new ProductCatalog
		dup
		invokespecial ProductCatalog/<init>()V
		astore 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		new Order
		dup
		invokespecial Order/<init>()V
		astore 3
		;Assign Statement
