package com.example.studybank;

import android.util.Log;

public class Questions {
    static class mc_question {
        String question_dialog;
        String ans1;
        String ans2;
        String ans3;
        String ans4;
        int answer_index;

        public mc_question() {
        }

        public mc_question(String dialog, String ans1, String ans2, String ans3, String ans4, int i) {
            this.question_dialog = dialog;
            this.ans1 = ans1;
            this.ans2 = ans2;
            this.ans3 = ans3;
            this.ans4 = ans4;
            this.answer_index = i;
        }

        static public mc_question parse_line_to_mc(String line){
            String[] split_line;
            split_line=line.split("&");
            //System.out.println(split_line);
            mc_question q = new mc_question(split_line[0],split_line[1],split_line[2],split_line[3],split_line[4],Integer.parseInt(split_line[5]));
            q.print();
            return q;
        }
        public void print(){
//            System.out.println(this.question_dialog);
//            System.out.println(this.ans1);
//            System.out.println(this.ans2);
//            System.out.println(this.ans3);
//            System.out.println(this.ans4);
//            System.out.println(this.answer_index);
            Log.w("printingmc",this.question_dialog);
            Log.w("printingmc",this.ans1);
            Log.w("printingmc",this.ans2);
            Log.w("printingmc",this.ans3);
            Log.w("printingmc",this.ans4);
            Log.w("printingmc", String.valueOf(this.answer_index));
        }

        public String getQuestion_dialog() {
            return question_dialog;
        }

        public void setQuestion_dialog(String question_dialog) {
            this.question_dialog = question_dialog;
        }

        public String getAns1() {
            return ans1;
        }

        public void setAns1(String ans1) {
            this.ans1 = ans1;
        }

        public String getAns2() {
            return ans2;
        }

        public void setAns2(String ans2) {
            this.ans2 = ans2;
        }

        public String getAns3() {
            return ans3;
        }

        public void setAns3(String ans3) {
            this.ans3 = ans3;
        }

        public String getAns4() {
            return ans4;
        }

        public void setAns4(String ans4) {
            this.ans4 = ans4;
        }

        public int getAnswer_index() {
            return answer_index;
        }

        public void setAnswer_index(int answer_index) {
            this.answer_index = answer_index;
        }


    }
}
