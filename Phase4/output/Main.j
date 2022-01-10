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
	Label_0:
		;Assign Statement
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		pop
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		ldc 10
		if_icmpgt Label_2 ; binary gt
		ldc 0
		goto Label_3
		Label_2:
		ldc 1
		Label_3:
		ifne Label_0
	Label_1:
		return
.end method
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
.end method
