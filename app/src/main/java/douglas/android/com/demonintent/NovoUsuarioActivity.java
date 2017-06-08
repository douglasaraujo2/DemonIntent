package douglas.android.com.demonintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NovoUsuarioActivity extends AppCompatActivity {


    @BindView(R.id.etUser)
    EditText etUser;
    @BindView(R.id.etNome)
    EditText etNome;
    @BindView(R.id.etPass)
    EditText etPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnCriar)
    public void criar() {
        Intent i = new Intent();
        i.putExtra("USERNAME", etUser.getText().toString());
        setResult(RESULT_OK, i);
        finish();
    }


}
