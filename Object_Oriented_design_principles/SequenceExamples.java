
public class SequenceExamples {
    public static String schoolSequence(){
        SchoolResultsApplication.Student s = new SchoolResultsApplication.Student("John");
        s.addSubject(new SchoolResultsApplication.Subject("Maths",90));
        s.addSubject(new SchoolResultsApplication.Subject("Science",85));
        return new SchoolResultsApplication.GradeCalculator().calculate(s);
    }
    public static String grocerySequence(){
        GroceryBillApplication.Customer c = new GroceryBillApplication.Customer("Alice");
        c.addProduct(new GroceryBillApplication.Product("Apples",3,2));
        c.addProduct(new GroceryBillApplication.Product("Milk",2,1));
        return new GroceryBillApplication.BillGenerator().printBill(c);
    }
}
