fun main(args: Array<String>){
	forTest5()
}

// for��
fun forTest1()
{
	for(i in 1..10)   //10�� ����
		println("i=$i")
}

fun forTest2()
{
	for(i in 1 until(11)) //11�� ������ �ȵ�
		println("i=$i")
}

fun forTest3()
{
	for(i in 1..10 step 2) //2�� ����
		println("i=$i")
}

fun forTest4()
{
//	for(i in 10..1) //�տ� ���� �ں��� Ŀ���Ѵ�.
	for(i in 10 downTo(1))
		println("i=$i")
}


//�ڹٴ� :�������� => ��Ʋ�� in !
//forEach => Array
fun forTest5()
{
	var names=arrayOf("ȫ�浿","��û��","������","�ڹ���","�����") //�迭
	for(item in names)
	{	
		println(item)
	}
	
}