public class Employee1
{
    int id;
    double salary=0.0;

    public Employee1(double salary) {
        this.salary = salary;
    }

    public Employee1(int Id) {
        this.id = id;

    }

    public Employee1() {
    }

    double CalTax(){
        if(this.salary > 500000.00 && this.salary < 1000000)
            return this.salary*0.1;

        else if(this.salary > 1000000.00 && this.salary < 1500000)
            return this.salary*0.2;

        else
            return this.salary*0.3;


    }

}
