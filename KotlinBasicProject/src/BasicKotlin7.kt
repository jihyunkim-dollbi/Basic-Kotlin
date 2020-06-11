/*
 ������ ���(function) => ��ä���� ���(class)
 	1)Ŭ���� ����
 		1.�Ű������� ���� ���
 			public class A
 			{
				public A(){}
 			}
 			A a=new A()  ȣ��
 			
 		==> class A
 			{
			
			}
 			val a=A() ȣ�� => val �����!
 
 			�ڹٴ� ��ü(Ŭ����) ������ new�� ��������� ��Ʋ���� ������� �ʴ´�.
 			List<String> list=new ArrayList<String>();
 		==> var list=ArrayList<String>() => ��ü�� �ҷ��Ë� new�� ������� �ʴ´�.
            
 		2.  �Ű������� �ִ� ���-1
 			class A(var name:String)==> Ŭ����&������ ���ÿ� ó��
 		==> var a=A("") => ȣ����
 			�Ű������� �ִ� ���-2
 			class A- Ŭ����
 			{
				constructor(name:String) -������
 				{
					������ 
				}
			}
 		3. �ɹ������� �ʱ�ȭ
 			���1)
 			public class Sawon
 			{
				private String name
 				private String dept
 				private String job
 				public Sawon(String name, String dept, String job)
 				{
					this.name=name	
				}
			}
 			���2)
 			==> class Sawon(var name:String, var dept:String, var job:String) //�ɹ����� ������ �Ű������μ� ������ ���ִ�.
 				{
							
				}
 				var s:Sawon("ȫ�浿","���ߺ�","���")
 				s.name="��û��"
 				s.dept="���ߺ�"
 				s.job="���"
 
 		**����������
 			1.public(default) : ��� Ŭ������ ������ ����(������ ����)
 				var a:String="" => public ������ ��
 			2.private : �ڽ��� Ŭ���� �ȿ����� ��밡��
 			3.protected : ��ӹ��� Ŭ���� �ȿ����� ����� ����
 			4.internal : ���� ���(����)�ȿ� �����ϴ� ��� Ŭ�������� ��밡�� =>same as default!
 
 
 	2)��ü ����
 	3)��������� �ʱ�ȭ
 	4)VO����� ���
 	5)�������̵�, ���
 		
*/
class Sawon
{
	constructor(name:String,dept:String,job:String) //������ �ȿ����� �Ű�����(��������)
	{
		println("name=$name")
		println("dept=$dept")
		println("job=$job")
	}
	
}

class Sawon2(var name:String, var dept:String, var job:String) //�������
{
	
}

class Sawon3
{
	var name:String=""   //public ����� ��// �������
	var dept:String=""
	var job:String=""
	
}
fun main(args: Array<String>) {
	var sa=Sawon("ȫ�浿","���ߺ�","���")
	var sa2=Sawon2("��û��","���ߺ�","����")
	
	
	println("�̸�="+sa2.name)
	println("�μ�="+sa2.dept)
	println("����="+sa2.job)
	
	println("==========================")
	var sa3=Sawon3()
	sa3.name="������"
	sa3.dept="���ߺ�"
	sa3.job="���"
	
	println("�̸�="+sa3.name)
	println("�μ�="+sa3.dept)
	println("����="+sa3.job)
	
	
}




