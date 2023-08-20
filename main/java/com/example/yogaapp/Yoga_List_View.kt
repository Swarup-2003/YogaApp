package com.example.yogaapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.yogaapp.databinding.ActivityHomeBinding
import com.example.yogaapp.databinding.ActivityMainBinding

class Yoga_List_View : AppCompatActivity() {
    private lateinit var listView : ListView
     val userArrayList: ArrayList<Items> = ArrayList()
     @SuppressLint("SuspiciousIndentation")
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_yoga_list_view)

         listView = findViewById(R.id.yogaListView)
supportActionBar?.hide()
         val imageid = intArrayOf(
             R.drawable.bridgepose,
             R.drawable.butterflypose,
             R.drawable.etp,
             R.drawable.camelpose,
             R.drawable.childpose,
             R.drawable.cowpose,
             R.drawable.catpose,
             R.drawable.corpsepose,
             R.drawable.fishpose,
             R.drawable.easypose,
             R.drawable.shoulderstandpose,
             R.drawable.utkatakonasana,
             R.drawable.parivrttaanjaneyasana,
             R.drawable.vajrasana,
             R.drawable.tree,
             R.drawable.paschimottanasana,
             R.drawable.headstand,
             R.drawable.uttanpadasana,
             R.drawable.halasana,
             R.drawable.gomukhasana,
             )

         val yoga_title = arrayOf(
             "BRIDGE POSE",
             "BUTTERFLY POSE",
             "EXTENDED TRIANGLE POSE",
             "CAMEL POSE",
             "CHILD POSE",
             "COW POSE",
             "CAT POSE",
             "CORPSE POSE",
             "FISH POSE",
             "EASY POSE",
             "SHOULDER STAND POSE",
             "UTKATAKONASANA",
             "PARIVRTTA ANJANEYASAN",
             "VAJRASANA",
             "VRIKSHANA",
             "PASCHIMOTTASANA",
             "HEADSTAND",
             "UTTANPADASANA",
             "HALASANA",
             "GOMUKHASANA",
         )

         val yoga_type = arrayOf(
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
             "BEGINNER",
         )

         val yoga_time = arrayOf(
             "is a powerful inversion technique which facilitates fresh oxygenated blood to reach the brain allowing more space for you to focus and think more clearly and thus alleviates anxiety, depression, and insomnia",
             "The relatively simple Butterfly pose which calms your mind and heart while draining away your tension and anxiety",
             "which is recommend by many yoga experts as great postures for beginners. It is thought to help alleviate anxiety and depression  helping you cope better when life is tough",
             "which can keep a person stress free by stimulating different parts of our body improving blood circulation and also releases pent up emotions",
             "which can keep a person stress free by stimulating different parts of our body improving blood circulation and also releases pent up emotions",
             "which can keep a person stress free by stimulating different parts of our body improving blood circulation and also releases pent up emotions",
             "which can keep a person stress free by stimulating different parts of our body improving blood circulation and also releases pent up emotions",
             "is  a total pose of relaxation and the best way to end your yoga practice which helps in complete relaxation of the tired muscles",
             "is  a total pose of relaxation and the best way to end your yoga practice which helps in complete relaxation of the tired muscles.The asana helps to control the anger issue of a person",
             "This is ideal position for meditating. It not only opens the practitioner’s hips, chest and shoulders but also lengthens the spine, improves posture, stretches the front of the ankles,keeps the mind alert, reduces stress and anxiety and helps to balance the activities of the reproductive organs",
             "is  a total pose of relaxation and the best way to end your yoga practice which helps in complete relaxation of the tired muscles.The asana helps to control the anger issue of a person",
             "is  a total pose of relaxation and the best way to end your yoga practice which helps in complete relaxation of the tired muscles.The asana helps to control the anger issue of a person",
             "is  a total pose of relaxation and the best way to end your yoga practice which helps in complete relaxation of the tired muscles.The asana helps to control the anger issue of a person",
             "helps in keeping the mind calm and stable",
             "This asana helps to bring balance to your mind and body. It makes your legs stronger and is a great hip opener as assists it the body in establishing pelvic stability and strengthens the bones of the hips and legs.It also helps strengthen the thighs, calves and ankles and helps improve focus",
             "One of the major health benefits from this is that it calms the body and relaxes the mind. It also helps circulate fresh blood to the head thereby relaxing the mind and reducing insomnia, depression and anxiety",
             "Yoga headstand is also called Salamba Shirshasana or just Shirshasana which is good for stimulating and providing refreshed blood to various endocrine glands",
             " It helps in treating acidity, indigestion and constipation. It also cures back pain and improves reproductive organs",
             "Helps cure backache, infertility, insomnia, sinusitis, thyroid and menstruation problems",
             "It is very beneficial intreating chronic knee pain, strengthens the spine and abdominal muscles. It also helps to improve chest activity",

             )

         for( i in yoga_title.indices) {
             val item = Items(yoga_title[i], yoga_time[i], yoga_type[i], imageid[i])
             userArrayList.add(item)
         }


         val adapter = myAdapter(this,userArrayList)
         listView.adapter = adapter

      listView.isClickable = true
         listView.setOnItemClickListener { parent, view, position, id ->
             val name = yoga_title[position]
             val type = yoga_type[position]
             val time = yoga_time[position]
             val img = imageid[position]

            val i = Intent(this,detail_yoga_pose::class.java)
             i.putExtra("name",name)
             i.putExtra("type",type)
             i.putExtra("time",time)
             i.putExtra("img",img)
             startActivity(i)
         }

    }
}