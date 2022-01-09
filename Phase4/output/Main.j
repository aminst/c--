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
		ldc 0
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		astore 2
		; If statement 14
		aload 2
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_0
		;Assign Statement
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		pop
		goto Label_1
	Label_0:
		;Assign Statement
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		ldc 2
		iadd
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		pop
	Label_1:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
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
