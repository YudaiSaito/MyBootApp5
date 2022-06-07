package jp.te4a.spring.boot.myapp12;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

//javadoc生成時のリンク作成
@Documented
//エラーチェッククラス Validatorを指定
@Constraint(validatedBy = WritterValidator.class)
//アノテーション適用要素の指定、メソッドとフィールド
@Target({ElementType.METHOD,ElementType.FIELD})
//コンパイル後にアノテーション情報を残すか？
@Retention(RetentionPolicy.RUNTIME)
public @interface Writter {
    String param();
    String message() default  "input other than  {param}."; 
    // Classオブジェクトを得る（戻り値とする）メソッドgroups()
    // デフォルト値は空のクラス
    Class<?>[] groups() default {};
    // Payloadクラスを継承したClassオブジェクトを得る
    // （戻り値とする）メソッドpayload()、デフォルト値は空のクラス
    Class<? extends Payload>[] payload() default{};
}

