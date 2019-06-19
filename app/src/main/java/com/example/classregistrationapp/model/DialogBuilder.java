package com.example.classregistrationapp.model;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;

public class DialogBuilder {
    AlertDialog.Builder builder;
    Context context;
    String incomingText;

    public DialogBuilder(Context context){
        builder = new AlertDialog.Builder(context);
        this.context = context;
    }

    public Dialog getBuiltDialogue(String title, String message){
        builder.setTitle(title)
                .setMessage(message)
                .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert);
        AlertDialog dialog = builder.create();
        return dialog;
    }

    public Dialog getBuiltTextDialogue(String title, String message){
        final EditText text = new EditText(context);
        builder.setTitle(title)
                .setMessage(message)
                .setView(text)
                .setPositiveButton("Enter", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        incomingText = text.getText().toString().trim();
                        dialogInterface.dismiss();
                    }
                })
                .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert);
        AlertDialog dialog = builder.create();
        return dialog;
    }
}
