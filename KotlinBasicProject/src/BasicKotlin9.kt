interface Runable{ //�ڵ�open
	fun run() //�������̽� �����
	
	//default�Լ�
	//�ʿ��� Ŭ���������� �������� ������ ���⼭ �̸� �����س�����!
	fun test(){
		println("Runable test().. call") //���������� �س���
	}
}

class Human:Runable{
	override fun run()
	{
		println("Human:run() call") // override�� ������ �������� ������
	}
}
class Human2:Runable{
	override fun run(){
	println("Human2:run() call")
	}
}
fun main(args: Array<String>) {
	var h=Human() //�޸��Ҵ�
	h.run()
	//Human:run() call
	h.test()
	//Runable test().. call
}