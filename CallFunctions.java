class CallFunctions
{
	int data=50;
	void CallByValue(int data)
	{
		data=data+100;
		System.out.println("In CallByValue function data value: "+data);
	}
	void CallByReference(CallFunction obj)
	{
		obj.data=obj.data+100;
		System.out.println("In CallBYReference function data value: "+data);
	}
	public static void main(String arg[])
	{
		CallFunction obj=new CallFunction();
		System.out.println("before call function :"+obj.data);
		obj.CallByValue(500);
		System.out.println("after calling callbyvalue function :"+obj.data);
		obj.CallByReference(obj);
		System.out.println("after calling callbyreference function : "+obj.data);
	}
}
