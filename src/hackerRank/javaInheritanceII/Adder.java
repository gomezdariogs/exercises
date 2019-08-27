package hackerRank.javaInheritanceII;

class Adder extends Arithmetic{
    public String superClass(){
        return "My superclass is: " + this.getClass().getSuperclass().getSimpleName();
    }
}
