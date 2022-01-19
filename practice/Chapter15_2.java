package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;


public class Chapter15_2 {
	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		
		Path inputPath = fs.getPath("resources/input.txt");
		Path outputPath = fs.getPath("resources/output.txt");
		
		// Filesクラスを使用してインスタンスを生成
		try (BufferedReader br = Files.newBufferedReader(inputPath);
				BufferedWriter bw = Files.newBufferedWriter(outputPath);) {
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				if (line.length() != 5) {
					// 文字数が5以外の時はスキップ
					continue;
				}
				///bufferedWriterのwriteおｗ使用
				bw.write(line);
				//改行
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("出力処理終了");
		}
	} 
}
