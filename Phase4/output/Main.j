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
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 3
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 4
		new Order
		dup
		invokespecial Order/<init>()V
		astore 5
		new ProductCatalog
		dup
		invokespecial ProductCatalog/<init>()V
		astore 6
		new ProductCatalog
		dup
		invokespecial ProductCatalog/<init>()V
		astore 7
		new ProductCatalog
		dup
		invokespecial ProductCatalog/<init>()V
		astore 8
		new ProductCatalog
		dup
		invokespecial ProductCatalog/<init>()V
		astore 9
		;Assign Statement
		aload 6
		dup ; to getfield for putting back on stack
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield ProductCatalog/id Ljava/lang/Integer;
		getfield ProductCatalog/id Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		;Assign Statement
		aload 7
		dup ; to getfield for putting back on stack
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield ProductCatalog/id Ljava/lang/Integer;
		getfield ProductCatalog/id Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		;Assign Statement
		aload 8
		dup ; to getfield for putting back on stack
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield ProductCatalog/id Ljava/lang/Integer;
		getfield ProductCatalog/id Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		;Assign Statement
		aload 9
		dup ; to getfield for putting back on stack
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield ProductCatalog/id Ljava/lang/Integer;
		getfield ProductCatalog/id Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		aload 3
		aload 6
		invokevirtual List/addElement(Ljava/lang/Object;)V
		aload 3
		aload 7
		invokevirtual List/addElement(Ljava/lang/Object;)V
		aload 3
		aload 8
		invokevirtual List/addElement(Ljava/lang/Object;)V
		aload 3
		aload 9
		invokevirtual List/addElement(Ljava/lang/Object;)V
		;Assign Statement
		aload 3
		ldc 0
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast ProductCatalog
		dup ; to getfield for putting back on stack
		ldc 5000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield ProductCatalog/price Ljava/lang/Integer;
		getfield ProductCatalog/price Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		;Assign Statement
		aload 3
		ldc 1
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast ProductCatalog
		dup ; to getfield for putting back on stack
		ldc 4000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield ProductCatalog/price Ljava/lang/Integer;
		getfield ProductCatalog/price Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		;Assign Statement
		aload 3
		ldc 2
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast ProductCatalog
		dup ; to getfield for putting back on stack
		ldc 2000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield ProductCatalog/price Ljava/lang/Integer;
		getfield ProductCatalog/price Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		;Assign Statement
		aload 3
		ldc 3
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast ProductCatalog
		dup ; to getfield for putting back on stack
		ldc 8000
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield ProductCatalog/price Ljava/lang/Integer;
		getfield ProductCatalog/price Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		;Assign Statement
		ldc 0
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		pop
	Label_0:
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		ldc 4
		if_icmplt Label_2 ; binary lt
		ldc 0
		goto Label_3
		Label_2:
		ldc 1
		Label_3:
		ifeq Label_1
		;Assign Statement
		new Fptr
		dup
		aload_0
		ldc "createOrder"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new Fptr
		dup
		aload_0
		ldc "createOrder"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		aload 3
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast ProductCatalog
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast Order
		dup ; keep value on stack
		astore 5
		pop
		aload 4
		aload 5
		invokevirtual List/addElement(Ljava/lang/Object;)V
		;Assign Statement
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		pop
		goto Label_0
	Label_1:
		;Assign Statement
		new Fptr
		dup
		aload_0
		ldc "getSum"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		new Fptr
		dup
		aload_0
		ldc "getSum"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		aload 4
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		pop
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 2
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
		aload 3
		dup ; to getfield for putting back on stack
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		putfield Order/quantity Ljava/lang/Integer;
		getfield Order/quantity Ljava/lang/Integer; ; for putting assign on stack 
		invokevirtual java/lang/Integer/intValue()I
		pop
		;Assign Statement
		aload 3
		dup ; to getfield for putting back on stack
		aload 1
		putfield Order/product LProductCatalog;
		getfield Order/product LProductCatalog; ; for putting assign on stack 
		pop
		aload 3
		areturn
.end method
.method public getSum(LList;)Ljava/lang/Integer;
.limit stack 128
.limit locals 128
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 4
	Label_0:
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		aload 1
		invokevirtual List/getSize()I
		if_icmplt Label_2 ; binary lt
		ldc 0
		goto Label_3
		Label_2:
		ldc 1
		Label_3:
		ifeq Label_1
		;Assign Statement
		aload 1
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast Order
		getfield Order/product LProductCatalog;
		getfield ProductCatalog/price Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		aload 1
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast Order
		getfield Order/quantity Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		imul
		aload 1
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast Order
		getfield Order/quantity Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 100
		imul
		iadd
		aload 1
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast Order
		getfield Order/product LProductCatalog;
		getfield ProductCatalog/price Ljava/lang/Integer;
		invokevirtual java/lang/Integer/intValue()I
		ldc 100
		idiv
		isub
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 4
		pop
		;Assign Statement
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		aload 4
		invokevirtual java/lang/Integer/intValue()I
		iadd
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		pop
		;Assign Statement
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		dup ; keep value on stack
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		pop
		goto Label_0
	Label_1:
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
.end method
