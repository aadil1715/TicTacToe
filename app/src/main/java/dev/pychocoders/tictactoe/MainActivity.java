package dev.pychocoders.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private Button mButton3;
    private Button mButton2;
    private Button mButton4;
    private Button mButton5;
    private Button mButton6;
    private Button mButton7;
    private Button mButton8;
    private Button mButton9;
    private Button resetbtn;
   public boolean turnx = true;
    public boolean turno = false;
   public char pos[] = new char[9];
   int flag = 0;
   Dialog dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.button);
        mButton3 = findViewById(R.id.button3);
        mButton2 = findViewById(R.id.button2);
        mButton4 = findViewById(R.id.button4);
        mButton5 = findViewById(R.id.button5);
        mButton6 = findViewById(R.id.button6);
        mButton7 = findViewById(R.id.button7);
        mButton8 = findViewById(R.id.button8);
        mButton9 = findViewById(R.id.button9);
        resetbtn = findViewById(R.id.reset);
        //String[] states = {"Empty","X","O"};


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String state = (String)mButton.getText();
                if(state.equals("") && turnx == true)
                {
                    mButton.setText("X");
                    pos[0] = 'x';
                    turnx = false;
                    turno = true;
                    if(pos[2] == pos[1] && pos[1] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        showDialog('X');
                        reset();

                    }
                    else  if(pos[6] == pos[3] && pos[3] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[8] == pos[4] && pos[4] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }

                }
                else if(state.equals("") && turno == true)
                {
                    mButton.setText("O");
                    pos[0] = 'o';
                    turno = false;
                    turnx = true;
                    if(pos[2] == pos[1] && pos[1] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else  if(pos[6] == pos[3] && pos[3] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[8] == pos[4] && pos[4] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }

                }

            }
        });
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String state = (String)mButton2.getText();
                if(state.equals("") && turnx == true)
                {
                    mButton2.setText("X");
                    pos[1] = 'x';
                    turnx = false;
                    turno = true;
                    if(pos[2] == pos[1] && pos[1] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[7] == pos[4] && pos[4] == pos[1])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[1], Toast.LENGTH_LONG).show();
                        reset();
                    }

                }
                else if(state.equals("") && turno == true)
                {
                    mButton2.setText("O");
                    pos[1] = 'o';
                    turno = false;
                    turnx = true;
                    if(pos[2] == pos[1] && pos[1] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[7] == pos[4] && pos[4] == pos[1])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[1], Toast.LENGTH_LONG).show();
                        reset();
                    }

                }

            }
        });
        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String state = (String)mButton3.getText();
                if(state.equals("") && turnx == true)
                {
                    mButton3.setText("X");
                    pos[2] = 'x';
                    turnx = false;
                    turno = true;
                    if(pos[2] == pos[1] && pos[1] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[8] == pos[5] && pos[5] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[6] == pos[4] && pos[4] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }
                }
                else if(state.equals("") && turno == true)
                {
                    mButton3.setText("O");
                    pos[2] = 'o';
                    turno = false;
                    turnx = true;
                    if(pos[2] == pos[1] && pos[1] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[8] == pos[5] && pos[5] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[6] == pos[4] && pos[4] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }
                }

            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String state = (String)mButton4.getText();
                if(state.equals("") && turnx == true)
                {
                    mButton4.setText("X");
                    pos[3] = 'x';
                    turnx = false;
                    turno = true;
                    if(pos[6] == pos[3] && pos[3] == pos[0])
                    {
                    Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[5] == pos[4] && pos[4] == pos[3])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[3], Toast.LENGTH_LONG).show();
                        reset();
                    }


                }
                else if(state.equals("") && turno == true)
                {
                    mButton4.setText("O");
                    pos[3] = 'o';
                    turno = false;
                    turnx = true;
                    if(pos[6] == pos[3] && pos[3] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[5] == pos[4] && pos[4] == pos[3])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[3], Toast.LENGTH_LONG).show();
                        reset();
                    }

                }

            }
        });
        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   // TO BE DONE
                String state = (String)mButton5.getText();
                if(state.equals("") && turnx == true)
                {
                    mButton5.setText("X");
                    pos[4] = 'x';
                    turnx = false;
                    turno = true;
                    if(pos[8] == pos[4] && pos[4] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[6] == pos[4] && pos[4] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[7] == pos[4] && pos[4] == pos[1])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[1], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[5] == pos[4] && pos[4] == pos[3])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[3], Toast.LENGTH_LONG).show();
                        reset();
                    }

                }
                else if(state.equals("") && turno == true)
                {
                    mButton5.setText("O");
                    pos[4] = 'o';
                    turno = false;
                    turnx = true;
                    if(pos[8] == pos[4] && pos[4] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[6] == pos[4] && pos[4] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[7] == pos[4] && pos[4] == pos[1])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[1], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[5] == pos[4] && pos[4] == pos[3])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[3], Toast.LENGTH_LONG).show();
                        reset();
                    }
                }

            }
        });
        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String state = (String)mButton6.getText();
                if(state.equals("") && turnx == true)
                {
                    mButton6.setText("X");
                    pos[5] = 'x';
                    turnx = false;
                    turno = true;
                    if(pos[8] == pos[5] && pos[5] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[5] == pos[4] && pos[4] == pos[3])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[3], Toast.LENGTH_LONG).show();
                        reset();
                    }


                }
                else if(state.equals("") && turno == true)
                {
                    mButton6.setText("O");
                    pos[5] = 'o';
                    turno = false;
                    turnx = true;
                    if(pos[8] == pos[5] && pos[5] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[5] == pos[4] && pos[4] == pos[3])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[3], Toast.LENGTH_LONG).show();
                        reset();
                    }

                }

            }
        });
        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //DONE
                String state = (String)mButton7.getText();
                if(state.equals("") && turnx == true)
                {
                    mButton7.setText("X");
                    pos[6] = 'x';
                    turnx = false;
                    turno = true;
                    if(pos[6] == pos[3] && pos[3] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[8] == pos[7] && pos[7] == pos[6])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[6], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[6] == pos[4] && pos[4] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }
                }
                else if(state.equals("") && turno == true)
                {
                    mButton7.setText("O");
                    pos[6] = 'o';
                    turno = false;
                    turnx = true;
                    if(pos[6] == pos[3] && pos[3] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[8] == pos[7] && pos[7] == pos[6])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[6], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[6] == pos[4] && pos[4] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }

                }
            }
        });
        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //DONE
                String state = (String)mButton8.getText();
                if(state.equals("") && turnx == true)
                {
                    mButton8.setText("X");
                    pos[7] = 'x';
                    turnx = false;
                    turno = true;
                    if(pos[8] == pos[7] && pos[7] == pos[6])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[6], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[7] == pos[4] && pos[4] == pos[1])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[1], Toast.LENGTH_LONG).show();
                        reset();
                    }

                }
                else if(state.equals("") && turno == true)
                {
                    mButton8.setText("O");
                    pos[7] = 'o';
                    turno = false;
                    turnx = true;
                    if(pos[8] == pos[7] && pos[7] == pos[6])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[6], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[7] == pos[4] && pos[4] == pos[1])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[1], Toast.LENGTH_LONG).show();
                        reset();
                    }


                }
            }
        });
        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //DONE
                String state = (String)mButton9.getText();
                if(state.equals("") && turnx == true)
                {
                    mButton9.setText("X");
                    pos[8] = 'x';
                    turnx = false;
                    turno = true;
                    if(pos[8] == pos[7] && pos[7] == pos[6])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[6], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[8] == pos[5] && pos[5] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[8] == pos[4] && pos[4] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }

                }
                else if(state.equals("") && turno == true)
                {
                    mButton9.setText("O");
                    pos[8] = 'o';
                    turno = false;
                    turnx = true;
                    if(pos[8] == pos[7] && pos[7] == pos[6])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[6], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[8] == pos[5] && pos[5] == pos[2])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[2], Toast.LENGTH_LONG).show();
                        reset();
                    }
                    else if(pos[8] == pos[4] && pos[4] == pos[0])
                    {
                        Toast.makeText(getApplicationContext(), "Winner is " + pos[0], Toast.LENGTH_LONG).show();
                        reset();
                    }

                }
            }
        });

        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

        for(int i=0;i<9;i++)
        {
            if(pos[i]==' ')
            {
                flag = 0;
            }
            else
            {
                flag = 1;
            }
        }

        if(flag == 1)
        {
            reset();
        }

    }

    public void reset()
    {
        mButton = findViewById(R.id.button);
        mButton3 = findViewById(R.id.button3);
        mButton2 = findViewById(R.id.button2);
        mButton4 = findViewById(R.id.button4);
        mButton5 = findViewById(R.id.button5);
        mButton6 = findViewById(R.id.button6);
        mButton7 = findViewById(R.id.button7);
        mButton8 = findViewById(R.id.button8);
        mButton9 = findViewById(R.id.button9);
        mButton.setText("");
        mButton2.setText("");
        mButton3.setText("");
        mButton4.setText("");
        mButton5.setText("");
        mButton6.setText("");
        mButton7.setText("");
        mButton8.setText("");
        mButton9.setText("");
        turnx = true;
        turno = false;
        for(int i=0;i<9;i++) {
            pos[i] = ' ';
        }

    }

    public void showDialog(char won)
    {
    dialog = new Dialog(MainActivity.this);
    dialog.setContentView(R.layout.layout);
    dialog.setTitle("Won!....");
    TextView text = dialog.findViewById(R.id.text) ;
    text.setText(won + "Won the game!");
        ImageView image = (ImageView) dialog.findViewById(R.id.image);


        Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
        // if button is clicked, close the custom dialog
       dialogButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               dialog.dismiss();
           }
       });

        dialog.show();
    }

}

