package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     public static ArrayList<Modelclass> ListOfQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListOfQ = new ArrayList<>();
        ListOfQ.add(new Modelclass("What is the new logo of Twitter after replacing the iconic bird logo?","Alphabet ‘X’","Rocket","Tesla Car","Chat symbol","Alphabet ‘X’"));
        ListOfQ.add(new Modelclass("Which Indian city is known as the 'Pink City'?", "Mumbai", "Delhi", "Jaipur", "Bangalore", "Jaipur"));

        ListOfQ.add(new Modelclass("What is the national animal of India?", "Tiger", "Elephant", "Lion", "Leopard", "Tiger"));

        ListOfQ.add(new Modelclass("Who is known as the 'Father of the Indian Constitution'?", "Mahatma Gandhi", "Jawaharlal Nehru", "B.R. Ambedkar", "Sardar Patel", "B.R. Ambedkar"));

        ListOfQ.add(new Modelclass("Which river is considered the holiest in Hinduism?", "Ganges", "Yamuna", "Brahmaputra", "Godavari", "Ganges"));

        ListOfQ.add(new Modelclass("What is the highest civilian award in India?", "Padma Shri", "Padma Bhushan", "Bharat Ratna", "Padma Vibhushan", "Bharat Ratna"));

        ListOfQ.add(new Modelclass("Which festival is also known as the 'Festival of Lights'?", "Holi", "Diwali", "Navratri", "Durga Puja", "Diwali"));

        ListOfQ.add(new Modelclass("Who was the first woman Prime Minister of India?", "Sonia Gandhi", "Indira Gandhi", "Mayawati", "Mamata Banerjee", "Indira Gandhi"));

        ListOfQ.add(new Modelclass("Which Indian cricketer is known as the 'Little Master'?", "Sachin Tendulkar", "Virat Kohli", "Rahul Dravid", "Kapil Dev", "Sachin Tendulkar"));

        ListOfQ.add(new Modelclass("In which state is the famous monument 'Taj Mahal' located?", "Delhi", "Rajasthan", "Uttar Pradesh", "Madhya Pradesh", "Uttar Pradesh"));

        ListOfQ.add(new Modelclass("Which Indian state is known as the 'Land of Five Rivers'?", "Punjab", "Haryana", "Gujarat", "Kerala", "Punjab"));
        ListOfQ.add(new Modelclass("Which Indian festival marks the victory of light over darkness?", "Eid", "Holi", "Diwali", "Christmas", "Diwali"));

        ListOfQ.add(new Modelclass("Who is the current Prime Minister of India as of September 2023?", "Narendra Modi", "Rahul Gandhi", "Amit Shah", "Sonia Gandhi", "Narendra Modi"));

        ListOfQ.add(new Modelclass("What is the national flower of India?", "Rose", "Tulip", "Lotus", "Sunflower", "Lotus"));

        ListOfQ.add(new Modelclass("Which state in India is famous for its backwaters and houseboats?", "Kerala", "Goa", "Rajasthan", "Himachal Pradesh", "Kerala"));

        ListOfQ.add(new Modelclass("Who wrote the Indian national anthem 'Jana Gana Mana'?", "Rabindranath Tagore", "Mahatma Gandhi", "Jawaharlal Nehru", "Sardar Patel", "Rabindranath Tagore"));

        ListOfQ.add(new Modelclass("What is the currency of India?", "Rupee", "Dollar", "Euro", "Yen", "Rupee"));

        ListOfQ.add(new Modelclass("Which mountain range separates India from the Tibetan Plateau?", "Himalayas", "Western Ghats", "Eastern Ghats", "Vindhya Range", "Himalayas"));

        ListOfQ.add(new Modelclass("Which Indian state is famous for the production of tea?", "Karnataka", "Tamil Nadu", "Assam", "Maharashtra", "Assam"));

        ListOfQ.add(new Modelclass("Who was the first woman to fly solo across the Atlantic Ocean?", "Indira Gandhi", "Amelia Earhart", "Sarojini Naidu", "Kalpana Chawla", "Amelia Earhart"));

        ListOfQ.add(new Modelclass("Which Mughal emperor built the Taj Mahal?", "Akbar", "Shah Jahan", "Aurangzeb", "Babur", "Shah Jahan"));

        ListOfQ.add(new Modelclass("Which river is often referred to as the 'Sorrow of Bihar' due to its frequent floods?", "Yamuna", "Ganges", "Brahmaputra", "Godavari", "Brahmaputra"));

        ListOfQ.add(new Modelclass("Who is known as the 'Missile Man of India'?", "Dr. A.P.J. Abdul Kalam", "Jawaharlal Nehru", "Sardar Patel", "Rajiv Gandhi", "Dr. A.P.J. Abdul Kalam"));

        ListOfQ.add(new Modelclass("Which Indian city is famous for its IT industry and is often called the 'Silicon Valley of India'?", "Mumbai", "Hyderabad", "Chennai", "Bengaluru", "Bengaluru"));

        ListOfQ.add(new Modelclass("What is the highest mountain peak in India?", "Mount Everest", "Kanchenjunga", "Nanda Devi", "Annapurna", "Kanchenjunga"));

        ListOfQ.add(new Modelclass("Which historical figure is known for his role in the Indian independence movement through non-violent civil disobedience?", "Subhas Chandra Bose", "Bhagat Singh", "Mahatma Gandhi", "Jawaharlal Nehru", "Mahatma Gandhi"));

        ListOfQ.add(new Modelclass("Which Indian state is known for the famous dance form called 'Kathak'?", "Kerala", "Odisha", "Rajasthan", "Uttar Pradesh", "Uttar Pradesh"));

        ListOfQ.add(new Modelclass("What is the national game of India?", "Cricket", "Hockey", "Badminton", "Football", "Hockey"));

        ListOfQ.add(new Modelclass("Who composed the Indian national song 'Vande Mataram'?", "Rabindranath Tagore", "Sarojini Naidu", "Bankim Chandra Chattopadhyay", "Subhas Chandra Bose", "Bankim Chandra Chattopadhyay"));

        ListOfQ.add(new Modelclass("Which famous historical monument in India is also known as the 'Symbol of Love'?", "Red Fort", "Qutub Minar", "Agra Fort", "Taj Mahal", "Taj Mahal"));

        ListOfQ.add(new Modelclass("Which state in India is renowned for its rich culture, traditional music, and colorful festivals, including Navratri?", "Gujarat", "Kerala", "Maharashtra", "Tamil Nadu", "Gujarat"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,DashBoardActivity.class);
                startActivity(intent);
            }
        },1500);
    }
}