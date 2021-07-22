class person{
	constructor(){
		var name;
		var age;
	}
	getName(){
		return this.name;
	}
	setName(name2){
		this.name=name2;
	}
	getAge(){
		return this.age;
	}
	setAge(age2){
		this.age=age2;
	}
}
var p=new person();
p.setName("Prakhar");
p.setAge(22);
document.writeln(p.getName()+" "+p.getAge());