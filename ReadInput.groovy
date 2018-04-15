class Person {
    String name
    int age
}
println "What is your name?"
def name = System.in.newReader().readLine()
println "What is your age?"
def age = Integer.parseInt(System.in.newReader().readLine())
def seb = new Person(age: age, name:name)

println "Your name is ${seb.name}"
