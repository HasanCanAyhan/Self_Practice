package day16_nestedLoop.practiceTasks;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        String str = "AAABBCCCCDDDDD";

        String result = "";


        for (int j = 0; j < str.length() ; j++) {

            char ch = str.charAt(j);

            int count = 0;
            for (int i = 0; i < str.length() ; i++) {

                if(str.charAt(i) == ch){
                    count++;
                }

            }

            if( !result.contains(""+ch) ){
                result += ch +""+ count;
            }


        }

        System.out.println(result); // A3B2C4D5





    }

}
/*
2. FrequencyOfCharacters:
			"AAABBCCCCDDDDD"

			output:
				A3B2C4D5
 */