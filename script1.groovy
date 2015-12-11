class School {
 def name
 List classRooms = []
}

class ClassRoom {
 def name
 Teacher teacher 
 def students = []
}
class Human {
 def lastName
 def firstName
 def age
}
class Teacher extends Human {
 ClassRoom classRoom
}
class Student extends Human {
 ClassRoom classRoom
}

​def langevin = new School(name:"Langevin 1")
def cm1cm2B = new ClassRoom(name:"CM1-CM2B")
def cm1cm2C = new ClassRoom(name:"CM1-CM2C")
def ce1A = new ClassRoom(name:"Ce1A")
langevin.classRooms << cm1cm2B
langevin.classRooms << ce1A
langevin.classRooms << cm1cm2C
def teacher = new Teacher(lastName:"Bourgin", firstName:"Guillaume", classRoom : cm1cm2B);
cm1cm2B.teacher = teacher
//println "Dans l`école $langevin.name il y a ${langevin.classRooms.size()} classes"
println langevin.classRooms.each { classRoom -> println "Dans $langevin.name il y a une classe $classRoom.name" }​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​​
​