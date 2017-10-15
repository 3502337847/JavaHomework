
public class Test2 {
	// TODO 自动生成的构造函数存根  
	    public static void main(String agsp[]){  
	    	Student 小王;
	    小王 = new Student("小王",18,"高中");  
	    小王.show();  
	    	System.out.print("——————————————————————————————");  
	        System.out.println();  
	        Undergraduate 小明;
	        小明 = new Undergraduate("小明",22,"大学本科","软件工程");  
	        小明.show();  
	        System.out.print("——————————————————————————————");  
	        System.out.println();  
	        Graduate 小李;  
	        小李 = new Graduate("小李",25,"研究生","云计算");  
	        小李.show();  
	         
	    }  
	}  

class Student{     //创建学生类Student 
	private String name;    //姓名  
	private int age;    //年龄 
	private String education;   //学历 
	Student(String name, int age, String education) { //构造方法  
		this.name = name; 
		this.age = age; 
		this.education = education; 
		}
	
	public void show() {
		System.out.println("姓名："+name+"  "+"年龄："+age+"  "+"学历："+education); 
		}
	} 

class Undergraduate extends Student{   //由学生类派生本科生类   
	private String specialty;
	Undergraduate(String name, int age, String education,String spe) {
		super(name, age, education);
		this.specialty = spe;
		} 
	
	public void show() {
		super.show();
		System.out.println("专业："+specialty);
		}
	}

class Graduate extends Student{   //由学生类派生研究生 类
	private String direction;  
    Graduate(String name, int age, String education,String dir) {  
    super(name, age, education);  
    this.direction=dir;  
    }

    public void show() {   
         super.show();  
         System.out.println("研究方向："+direction);  
     }     
   }