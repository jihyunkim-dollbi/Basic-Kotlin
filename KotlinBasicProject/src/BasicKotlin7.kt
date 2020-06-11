/*
 절차적 언어(function) => 객채지향 언어(class)
 	1)클래스 선언
 		1.매개변수가 없는 경우
 			public class A
 			{
				public A(){}
 			}
 			A a=new A()  호출
 			
 		==> class A
 			{
			
			}
 			val a=A() 호출 => val 상수형!
 
 			자바는 객체(클래스) 생성시 new를 사용하지만 코틀린은 사용하지 않는다.
 			List<String> list=new ArrayList<String>();
 		==> var list=ArrayList<String>() => 객체를 불러올떄 new를 사용하지 않는다.
            
 		2.  매개변수가 있는 경우-1
 			class A(var name:String)==> 클래스&생성자 동시에 처리
 		==> var a=A("") => 호출방법
 			매개변수가 있는 경우-2
 			class A- 클래스
 			{
				constructor(name:String) -생성자
 				{
					생성자 
				}
			}
 		3. 맴버변수의 초기화
 			방법1)
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
 			방법2)
 			==> class Sawon(var name:String, var dept:String, var job:String) //맴버변수 선언을 매개변수로서 선언할 수있다.
 				{
							
				}
 				var s:Sawon("홍길동","개발부","사원")
 				s.name="심청이"
 				s.dept="개발부"
 				s.job="사원"
 
 		**접근지정어
 			1.public(default) : 모든 클래스에 접근이 가능(생략이 가능)
 				var a:String="" => public 생략된 것
 			2.private : 자신의 클래스 안에서만 사용가능
 			3.protected : 상속받은 클래스 안에서만 사용이 가능
 			4.internal : 같은 모듈(폴더)안에 존재하는 모든 클래스에서 사용가능 =>same as default!
 
 
 	2)객체 생성
 	3)멤버변수의 초기화
 	4)VO만드는 방법
 	5)오버라이딩, 상속
 		
*/
class Sawon
{
	constructor(name:String,dept:String,job:String) //생성자 안에서는 매개변수(지역변수)
	{
		println("name=$name")
		println("dept=$dept")
		println("job=$job")
	}
	
}

class Sawon2(var name:String, var dept:String, var job:String) //멤버변수
{
	
}

class Sawon3
{
	var name:String=""   //public 선언된 것// 멤버변수
	var dept:String=""
	var job:String=""
	
}
fun main(args: Array<String>) {
	var sa=Sawon("홍길동","개발부","사원")
	var sa2=Sawon2("심청이","개발부","과장")
	
	
	println("이름="+sa2.name)
	println("부서="+sa2.dept)
	println("직위="+sa2.job)
	
	println("==========================")
	var sa3=Sawon3()
	sa3.name="춘향이"
	sa3.dept="개발부"
	sa3.job="사원"
	
	println("이름="+sa3.name)
	println("부서="+sa3.dept)
	println("직위="+sa3.job)
	
	
}




