//switch => when
fun main(args: Array<String>) {
/*	
	var sex=3
	var s=sexCheck(sex)
	println("s=$s")
	//s=����
*/
	var i=8
	numberSelect(i) //2�� 3�� ������
	//println("i=$i")
}

fun sexCheck(sex:Int):String{
	var s:String=" "
	when(sex)
	{
		1->s="����"
		2->s="����"
		3->s="����"
		4->s="����"
	}
	return s
}

fun numberSelect(a:Int)
{
	when(a){
	1->println("1�� ������")
	2,3->println("2�� 3�� ������")
	in 4..7->println("4~7���� ������") //4,5,6,7 //
	8,9->println("8�� 9 ������")
	!in 1..7->println("8,9�� ���õ�") //1~7�ȿ� ������ �ȵǾ��ٸ�~
		
	}
	
}