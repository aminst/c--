.class public Main
.super java/lang/Object
.method public <init>()V
.limit stack 128
.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		new ProductCatalog
		dup
		invokespecial ProductCatalog/<init>()V
		astore 1
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		getfield ProductCatalog/id Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		return
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
.end method
