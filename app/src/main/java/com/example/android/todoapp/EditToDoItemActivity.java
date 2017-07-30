package com.example.android.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditToDoItemActivity extends AppCompatActivity {

    EditText todoItemEdit;
    int positionOfTheItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_to_do_item);
        todoItemEdit = (EditText) findViewById(R.id.toDoItemEditText);
        todoItemEdit.append(getIntent().getStringExtra("itemText"));
        positionOfTheItem = getIntent().getExtras().getInt("position");
    }

    public void onEditItem(View view) {
        Intent data = new Intent();
        data.putExtra("editedText",todoItemEdit.getText().toString());
        data.putExtra("position", positionOfTheItem);
        setResult(RESULT_OK,data);
        finish();
    }

}
