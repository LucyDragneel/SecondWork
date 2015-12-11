package com.example.asus.secondwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private String[] names = {"周一", "周二", "周三", "周四", "周五", "周六", "周七",
            "周八", "周九", "周十", "周十一", "周十二", "周十三", "周十四", "周十五", "周十六", "周十七"};
    private int[] grades = {2015, 2013, 2014, 2015, 2013, 2013, 2015, 2014, 2014,
            2012, 2015, 2013, 2014, 2013, 2013, 2015, 2013};
    private String[] majors = {"computer","computer","computer","computer","computer","computer",
            "computer","computer","computer","computer","computer","computer","computer","computer",
            "computer","computer","computer",};
    private int[] banjis = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
    //private List<Student> studentList = new ArrayList<Student>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> listItem = new HashMap<String, Object>();
            listItem.put("studentname", names[i]);
            listItem.put("studentgrade", grades[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems, R.layout.student_item,
                new String[]{"studentname", "studentgrade"},
                new int[]{R.id.student_name, R.id.student_grade});
        final ListView list = (ListView) findViewById(R.id.list_view);
        list.setAdapter(simpleAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*Intent intent=new Intent();
                intent.setClass(MainActivity.this, TargetActivity.class);
                startActivity(intent);
                switch (parent.getId()) {
                    case R.id.list_view:
                        expressItemClick(position);
                        break;
                }
            }
        });
    }
    public void expressItemClick(int postion) {
        Intent intent = new Intent(MainActivity.this, TargetActivity.class);
        intent.putExtra("name",names);
        intent.putExtra("grade",grades);
        intent.putExtra("major",majors);
        intent.putExtra("banji",banjis);
        startActivity(intent);
        finish();*/
                ListView listView = (ListView)parent;
                HashMap<String, String> map = (HashMap<String, String>) listView.getItemAtPosition(position);
                String name = map.get("name");
                String grade = map.get("grade");
                String major  = map.get("major");
                String banji = map.get("banji");
                Intent i = new Intent();
                i.setClass(MainActivity.this,TargetActivity.class);
                i.putExtra("name",names);
                i.putExtra("grade",grades);
                i.putExtra("major",majors);
                i.putExtra("banji",banjis);
                startActivity(i);

            }
        });

    }
}




        /*initStudents();
        StudentAdapter adapter = new StudentAdapter(
                MainActivity.this,R.layout.student_item,studentList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        private void initStudents()
    {
        Student one = new Student("周一",2015);
        studentList.add(one);
        Student two = new Student("周二",2012);
        studentList.add(two);
        Student three = new Student("周三",2013);
        studentList.add(three);
        Student four = new Student("周四",2015);
        studentList.add(four);
        Student five = new Student("周五",2014);
        studentList.add(five);
        Student six = new Student("周六",2012);
        studentList.add(six);
        Student seven = new Student("周七",2015);
        studentList.add(seven);
        Student eight = new Student("周八",2013);
        studentList.add(eight);
        Student nine = new Student("周九",2014);
        studentList.add(nine);
        Student ten = new Student("周十",2013);
        studentList.add(ten);
        Student eleven = new Student("周十一",2015);
        studentList.add(eleven);
        Student twelve = new Student("周十二",2014);
        studentList.add(twelve);
        Student thirteen = new Student("周十三",2012);
        studentList.add(thirteen);
        Student fourteen = new Student("周十四",2012);
        studentList.add(fourteen);
        Student fifteen = new Student("周十五",2014);
        studentList.add(fifteen);
        Student sixteen = new Student("周十六",2015);
        studentList.add(sixteen);
        Student senventeen = new Student("周十七",2014);
        studentList.add(senventeen);

    }
    */

