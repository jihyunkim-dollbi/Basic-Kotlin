/*
 	����� ������ Ŭ���� ==> open class
 	=> ����� �޾Ƽ� �Լ��� ������ ���� => open�ؾ� ���/������ ����
 
 
 
 */
open class Saram{       //����� ������ Ŭ������ open����ϱ�
	var name:String=""
	var sex:String=""
	var addr:String=""

	open fun myData() //�ٸ������� ����ϰ� �Ϸ��� open�ֱ�
	{
		println("Saram:myData() call..")
	}
}

class Member:Saram()
{
	fun dataPrint() //��� ������ --- �Ķ� ������ �׾�����
	{
		name="ȫ�浿" //������ ��ӹ޾� �� ����
		sex="����"
		addr="����"
	}
	override fun myData() //������ => open�Ȱ͸� �������Ͽ� ��밡��
	{
		println("Member:myData() call..")
	}
}

fun main(args: Array<String>) {
	
	var mem:Member=Member(); //��ü����
	mem.dataPrint()//��� ����
	println(mem.name)
	println(mem.sex)
	println(mem.addr)
	mem.myData()
}


