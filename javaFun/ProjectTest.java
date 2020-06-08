public class ProjectTest {
    public static void main(String[] args) {
        //test 1
        Project test = new Project("iPhone", "New and improved experience");
        test.setName("iPhone 12");
        test.setDescription("Better Camera and user experience!");
        System.out.println("Name: " + test.getName());
        System.out.println("Description: " + test.getDescription());
        System.out.println("Pitch: " + test.elevatorPitch());
        //test 2
        Project test2 = new Project();
        test2.setName("Honda Civic");
        test2.setDescription("2020 sedan with improved steering!");
        System.out.println("Name: " + test2.getName());
        System.out.println("Description: " + test2.getDescription());
        System.out.println("Pitch: " + test2.elevatorPitch());
        //test 3 
        Project test3 = new Project("Headphones");
        test3.setDescription("Great Sound Quality with improved bass!");
        System.out.println("Name: " + test3.getName());
        System.out.println("Description: " + test3.getDescription());
        System.out.println("Pitch: " + test3.elevatorPitch());
    }
}