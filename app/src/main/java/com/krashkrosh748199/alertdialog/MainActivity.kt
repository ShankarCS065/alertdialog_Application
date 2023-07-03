package com.krashkrosh748199.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setMessage("do you want to add Mr.poop to your contacts list")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("yes"){ _, _ ->
                Toast.makeText(this,"you add Mr.Poop to your contact list",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("NO"){ _, _ ->
                Toast.makeText(this,"you didn't  add Mr.Poop to your contact list",Toast.LENGTH_SHORT).show()
            }.create()

        val btnFirst=findViewById<Button>(R.id.btnDialog1)
        btnFirst.setOnClickListener {
            addContactDialog.show()
        }

        val options= arrayOf("First item","Second item","Third item")
        val singleChoiceDialog=AlertDialog.Builder(this)
            .setTitle("choose one of this option")
            .setSingleChoiceItems(options,0){ _, i ->
                Toast.makeText(this,"you clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept"){ _, _ ->
                Toast.makeText(this,"you accepted the singleChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _, _ ->
                Toast.makeText(this,"you declined the singleChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()
val btnSecond=findViewById<Button>(R.id.btnDialog2)
        btnSecond.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multiChoiceDialog=AlertDialog.Builder(this)
            .setTitle("choose one of this option")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)) { _, i, isChecked ->
                if (isChecked) {
                    Toast.makeText(this, "you checked ${options[i]}", Toast.LENGTH_SHORT).show()
                }
                else
                {
                    Toast.makeText(this, "you unchecked ${options[i]}", Toast.LENGTH_SHORT).show()

                }
            }
            .setPositiveButton("Accept"){ _, _ ->
                Toast.makeText(this,"you accepted the multiChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _, _ ->
                Toast.makeText(this,"you declined the multiChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()
val btnThird=findViewById<Button>(R.id.btnDialog3)
        btnThird.setOnClickListener {
            multiChoiceDialog.show()
        }

    }
}