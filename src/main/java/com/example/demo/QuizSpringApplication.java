package com.example.demo;
//教科書p233 list10.4

//修正　p251 list11.6, list11.10

//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.demo.repository.QuizRepository;
//import com.example.demo.entity.Quiz;
//import com.example.demo.service.QuizService;

@SpringBootApplication
public class QuizSpringApplication {
	/** 起動メソッド */
	public static void main(String[] args) {
		SpringApplication.run(QuizSpringApplication.class, args);
		//				.getBean(QuizSpringApplication.class).execute();
	}

	//	/** 注入 */
	//	@Autowired
	//	QuizService service;
	//
	//	/** 実行メソッド */
	//	private void execute() {
	//		// 登録処理
	//		//		setup();
	//		//		//全件取得
	//		//		showList();
	//		//		// １件取得
	//		//		showOne();
	//		//更新処理
	//		//		updateQuiz();
	//		//		//削除処理
	//		//		deleteQuiz();
	//		// クイズを実行する
	//		doQuiz();
	//	}
	//
	//	/** === クイズを5件登録します === */
	//	private void setup() {
	//		System.out.println("--- 登録処理開始 ---");
	//		// エンティティ生成
	//		Quiz quiz1 = new Quiz(null, "「Java」はオブジェクト指向言語である。", true, "登録太郎");
	//		Quiz quiz2 = new Quiz(null, "「Spring Data」はデータアクセスに対する"
	//				+ "機能を提供する。", true, "登録太郎");
	//		Quiz quiz3 = new Quiz(null, "プログラムが沢山配置されているサーバーの"
	//				+ "ことを「ライブラリ」いう。", false, "登録太郎");
	//		Quiz quiz4 = new Quiz(null, "「@Component」はインスタンス生成アノテーション"
	//				+ "である。", true, "登録太郎");
	//		Quiz quiz5 = new Quiz(null, "「Spring MVC」が実装している「デザインパターン」で"
	//				+ "すべてのリクエストを１つのコントローラで受け取るパターンは"
	//				+ "「シングルコントローラ・パターン」である。", false, "登録太郎");
	//		// リストにエンティティを格納
	//		List<Quiz> quizList = new ArrayList<>();
	//		// 第一引数に格納先、第二引数は可変長引数なので、エンティティを記述
	//		Collections.addAll(quizList, quiz1, quiz2, quiz3, quiz4, quiz5);
	//		//登録実行
	//		for (Quiz quiz : quizList) {
	//			//登録実行
	//			service.insertQuiz(quiz);
	//		}
	//		System.out.println("--- 登録処理完了 ---");
	//	}
	//
	//	/** === クイズを2件登録します === */
	//	//	private void setup() {
	//	//		// エンティティ生成
	//	//		Quiz quiz1 = new Quiz(null, "「Spring」はフレームワークですか？", true, "登録太郎");
	//	//		// 登録実行
	//	//		quiz1 = repository.save(quiz1);
	//	//		// 登録確認
	//	//		System.out.println("登録したデータは、" + quiz1 + "です。");
	//	//		// エンティティ生成
	//	//		Quiz quiz2 = new Quiz(null, "「Spring MVC」はバッチ処理機能を提供しますか？", false, "登録太郎");
	//	//		// 登録実行
	//	//		quiz2 = repository.save(quiz2);
	//	//		// 登録確認
	//	//		System.out.println("登録したデータは、" + quiz2 + "です。");
	//	//	}
	//	/** === 全件取得 === */
	//	private void showList() {
	//		System.out.println("--- 全件取得開始 ---");
	//		// リポジトリを使用して全件取得を実施、結果を取得
	//		Iterable<Quiz> quizzes = service.selectAll();
	//		for (Quiz quiz : quizzes) {
	//			System.out.println(quiz);
	//		}
	//		System.out.println("--- 全件取得完了 ---");
	//	}
	//
	//	/** === １件取得 === */
	//	private void showOne() {
	//		System.out.println("--- １件取得開始 ---");
	//		// リポジトリを使用して１件取得を実施、結果を取得（戻り値はOptional）
	//		Optional<Quiz> quizOpt = service.selectOneById(1); //error「Optional を型に解決できません」
	//		// 値存在チェック
	//		if (quizOpt.isPresent()) {
	//			System.out.println(quizOpt.get());
	//		} else {
	//			System.out.println("該当する問題が存在しません・・・");
	//		}
	//		System.out.println("--- １件取得完了 ---");
	//	}
	//
	//	/** === 更新処理 === */
	//	private void updateQuiz() {
	//		System.out.println("--- 更新処理開始 ---");
	//		// 変更したいエンティティを生成する
	//		Quiz quiz1 = new Quiz(1, "「スプリング」はフレームワークですか？", true, "変更タロウ");
	//		// 更新実行
	//		service.updateQuiz(quiz1);
	//		System.out.println("--- 更新処理完了 ---");
	//	}
	//
	//	/** === 削除処理 === */
	//	private void deleteQuiz() {
	//		System.out.println("--- 削除処理開始 ---");
	//		// 削除実行
	//		service.deleteQuizById(2);
	//		System.out.println("--- 削除処理完了 ---");
	//	}
	//
	//	/** === ランダムでクイズを取得して、クイズの正解/不正解を判定する === */
	//	private void doQuiz() {
	//		System.out.println("--- クイズ１件取得開始 ---");
	//		// リポジトリを使用して１件取得を実施、結果を取得（戻り値はOptional）
	//		Optional<Quiz> quizOpt = service.selectOneRandomQuiz();
	//		// 値存在チェック
	//		if (quizOpt.isPresent()) {
	//			System.out.println(quizOpt.get());
	//		} else {
	//			System.out.println("該当する問題が存在しません・・・");
	//		}
	//		System.out.println("--- クイズ１件取得完了 ---");
	//		// 解答を実施
	//		Boolean myAnswer = false;
	//		Integer id = quizOpt.get().getId();
	//		if (service.checkQuiz(id, myAnswer)) {
	//			System.out.println("正解です！");
	//		} else {
	//			System.out.println("不正解です・・・");
	//		}
	//	}
}
