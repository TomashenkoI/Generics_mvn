//import org.junit.Assert;
//import org.junit.Test;
//import ua.goit.java.Student;
//import ua.goit.java.ValidatorImpl;
//
///**
// * Created by 7 on 04.07.2016.
// */
//public class ValidatorImplTest {
//
//    ValidatorImpl validator = new ValidatorImpl();
//
//    @Test
//    public void testIsValid() {
//
//        Student student1 = new Student("male", "Vasya", 19, 2);
//        Student student2 = new Student("female", "Elizabeth", 23, 5);
//        Student student3 = new Student("male", "Dmitriy", 24, 5);
//
//        boolean exp1 = validator.isValid(student1);
//        boolean exp2 = validator.isValid(student2);
//        boolean exp3 = validator.isValid(student3);
//
//        Assert.assertEquals(false, exp1);
//        Assert.assertEquals(false, exp2);
//        Assert.assertEquals(true, exp3);
//    }
//}
