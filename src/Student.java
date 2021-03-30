package src;

/*
 * first class to use as a type
 */

public class Student {
  String firstName;
  String lastName;
  double gpa;
  String major;
  int age;
  boolean onProbation;

  public Student(String firstName, String lastName, double gpa, String major, int age, boolean onProbation) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gpa = gpa;
    this.major = major;
    this.onProbation = onProbation;
  }

  public boolean isOnHonorRoll() {
    if (this.gpa >= 3.5)
      return true;
    return false;
  }
}
