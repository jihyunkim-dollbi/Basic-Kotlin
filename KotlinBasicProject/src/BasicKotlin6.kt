import java.util.*
/*
 �Լ�
 =������ �ִ� ���
 fun �Լ���(�Ű�����...):��������{}  ==> ():Int, ():String, ():Array(�迭����)	
 
 =������ ���� ���
 fun �Լ���(�Ű�����...){} ==> void

 */
fun main(args: Array<String>) {
	
	var temp=((Math.random()*100)+1).toInt()
	var com=temp.toInt() //����ȯ
	println("temp=$temp")
	println("com=$com")
	
    //toDouble() , toString(), toInt
	
	var scan=Scanner(System.`in`)
	while(true)
	{
		print("1���� 100���� ������ �Է�:")
		var i=scan.nextInt()
		if(i<0 || i>100)
		{
			println("1~100���� ������ ������ �Է��ϼ���")
			continue
		}
		
		if(i<com){
			println("�Է°����� ū���� �Է��ϼ���")
			
		}else if(i>com){
				println("�Է°����� ���� ���� �Է��ϼ���")
		}else{
			println("Game over!")
			break
		}
			
	}
}

