package runtimeAnalizer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import retryAnalizer.ReryLogic;

public class RuntimeErrorGuess implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testlcass, Constructor testconstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(ReryLogic.class);
		
	}

}
