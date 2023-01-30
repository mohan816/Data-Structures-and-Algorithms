package stacks.queues;

public class StudentsUnableToEatLunch {
	
	public static int countStudents(int[] students, int[] sandwiches) {
        int result = 0, studentZeroCount = 0, studentOneCount = 0, sandWichesZeroCount = 0, sandWichesOneCount = 0;
        for(int i = 0; i < students.length; i++){
            if(students[i] == 1 && sandwiches[i] == 1){
                result = result + 1;
                //System.out.println(result);
                studentOneCount++;
                sandWichesOneCount++;
            }
            else if(students[i] == 0  &&  sandwiches[i] == 0){
                  result = result + 1;
                  studentZeroCount++;
                  sandWichesZeroCount++;

            }
            else if(students[i] == 0 && sandwiches[i] == 1){
                studentZeroCount++;
                sandWichesOneCount++;
            }
            else if(students[i] == 1 && sandwiches[i] == 0){
                sandWichesZeroCount++;
                studentOneCount++;
            }
        }
        if((sandWichesZeroCount == studentZeroCount) && (studentOneCount == sandWichesOneCount))
            return 0;
    return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] students = {0,0,1,1,0,0,0,0,1,0,0,1,1,0,1,1};
		int[] sandwiches = {1,0,0,0,0,0,0,1,0,0,1,0,1,1,1,0};
		int result = countStudents(students,sandwiches);
		System.out.println(result);
		

	}

}
