class AA //���� �����ʰ� �ʱⰪ�� �־���Ѵ�. //null�� ó��
{
	val b:String?=null //��Ʈ�������� �ʱⰪ�� �ٶ� ����!
	val a:String=""
	val c:BB?=null //Ŭ���� ��ü �ʱ�ȭ

}
class BB
{
	
	
}

fun main(args:Array<String>)
{
	val foods:List<String> = listOf("���","��","����") // >������  = �� ��ĭ ���
	for(f in foods){
		println("1"+f)
	}
	// :List<String> => �������� ���� ����
	val foods2=mutableListOf("��","��","���")
	foods2.add("��")
	foods2.removeAt(0)
	foods2[1]="����"
	for(f in foods2)
		{
			println("2"+f)
		}
}

// 1 2 3 4 5 6 7 8 9 0
