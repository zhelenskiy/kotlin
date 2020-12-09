/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jvm.compiler;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class LoadJava8TestGenerated extends AbstractLoadJava8Test {
    @TestMetadata("compiler/testData/loadJava8/compiledJava")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CompiledJava extends AbstractLoadJava8Test {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestCompiledJava, this, testDataFilePath);
        }

        public void testAllFilesPresentInCompiledJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/compiledJava"), Pattern.compile("^(.+)\\.java$"), null, true);
        }

        @TestMetadata("InnerClassTypeAnnotation.java")
        public void testInnerClassTypeAnnotation() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/InnerClassTypeAnnotation.java");
        }

        @TestMetadata("MapRemove.java")
        public void testMapRemove() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/MapRemove.java");
        }

        @TestMetadata("ParameterNames.java")
        public void testParameterNames() throws Exception {
            runTest("compiler/testData/loadJava8/compiledJava/ParameterNames.java");
        }

        @TestMetadata("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class TypeParameterAnnotations extends AbstractLoadJava8Test {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTestCompiledJava, this, testDataFilePath);
            }

            public void testAllFilesPresentInTypeParameterAnnotations() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations"), Pattern.compile("^(.+)\\.java$"), null, true);
            }

            @TestMetadata("Basic.java")
            public void testBasic() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations/Basic.java");
            }

            @TestMetadata("Basic_DisabledImprovements.java")
            public void testBasic_DisabledImprovements() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations/Basic_DisabledImprovements.java");
            }

            @TestMetadata("Basic_DisabledImprovementsAndreading.java")
            public void testBasic_DisabledImprovementsAndreading() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations/Basic_DisabledImprovementsAndreading.java");
            }

            @TestMetadata("Basic_DisabledReading.java")
            public void testBasic_DisabledReading() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeParameterAnnotations/Basic_DisabledReading.java");
            }
        }

        @TestMetadata("compiler/testData/loadJava8/compiledJava/typeUseAnnotations")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class TypeUseAnnotations extends AbstractLoadJava8Test {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTestCompiledJava, this, testDataFilePath);
            }

            public void testAllFilesPresentInTypeUseAnnotations() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/compiledJava/typeUseAnnotations"), Pattern.compile("^(.+)\\.java$"), null, true);
            }

            @TestMetadata("BaseClassTypeArguments.java")
            public void testBaseClassTypeArguments() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/BaseClassTypeArguments.java");
            }

            @TestMetadata("Basic.java")
            public void testBasic() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/Basic.java");
            }

            @TestMetadata("Basic_DisabledImprovements.java")
            public void testBasic_DisabledImprovements() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/Basic_DisabledImprovements.java");
            }

            @TestMetadata("Basic_DisabledImprovementsAndReading.java")
            public void testBasic_DisabledImprovementsAndReading() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/Basic_DisabledImprovementsAndReading.java");
            }

            @TestMetadata("Basic_DisabledReading.java")
            public void testBasic_DisabledReading() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/Basic_DisabledReading.java");
            }

            @TestMetadata("ClassTypeParameterBounds.java")
            public void testClassTypeParameterBounds() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/ClassTypeParameterBounds.java");
            }

            @TestMetadata("MethodReceiver.java")
            public void testMethodReceiver() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/MethodReceiver.java");
            }

            @TestMetadata("MethodTypeParameterBounds.java")
            public void testMethodTypeParameterBounds() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/MethodTypeParameterBounds.java");
            }

            @TestMetadata("ReturnType.java")
            public void testReturnType() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/ReturnType.java");
            }

            @TestMetadata("ValueArguments.java")
            public void testValueArguments() throws Exception {
                runTest("compiler/testData/loadJava8/compiledJava/typeUseAnnotations/ValueArguments.java");
            }
        }
    }

    @TestMetadata("compiler/testData/loadJava8/sourceJava")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SourceJava extends AbstractLoadJava8Test {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTestSourceJava, this, testDataFilePath);
        }

        public void testAllFilesPresentInSourceJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/sourceJava"), Pattern.compile("^(.+)\\.java$"), null, true);
        }

        @TestMetadata("MapRemove.java")
        public void testMapRemove() throws Exception {
            runTest("compiler/testData/loadJava8/sourceJava/MapRemove.java");
        }

        @TestMetadata("TypeParameterAnnotations.java")
        public void testTypeParameterAnnotations() throws Exception {
            runTest("compiler/testData/loadJava8/sourceJava/TypeParameterAnnotations.java");
        }

        @TestMetadata("compiler/testData/loadJava8/sourceJava/typeParameterAnnotations")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class TypeParameterAnnotations extends AbstractLoadJava8Test {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTestSourceJava, this, testDataFilePath);
            }

            public void testAllFilesPresentInTypeParameterAnnotations() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/sourceJava/typeParameterAnnotations"), Pattern.compile("^(.+)\\.java$"), null, true);
            }

            @TestMetadata("Basic.java")
            public void testBasic() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeParameterAnnotations/Basic.java");
            }

            @TestMetadata("Basic_DisabledImprovements.java")
            public void testBasic_DisabledImprovements() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeParameterAnnotations/Basic_DisabledImprovements.java");
            }

            @TestMetadata("Basic_DisabledImprovementsAndreading.java")
            public void testBasic_DisabledImprovementsAndreading() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeParameterAnnotations/Basic_DisabledImprovementsAndreading.java");
            }

            @TestMetadata("Basic_DisabledReading.java")
            public void testBasic_DisabledReading() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeParameterAnnotations/Basic_DisabledReading.java");
            }
        }

        @TestMetadata("compiler/testData/loadJava8/sourceJava/typeUseAnnotations")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class TypeUseAnnotations extends AbstractLoadJava8Test {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTestSourceJava, this, testDataFilePath);
            }

            public void testAllFilesPresentInTypeUseAnnotations() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/loadJava8/sourceJava/typeUseAnnotations"), Pattern.compile("^(.+)\\.java$"), null, true);
            }

            @TestMetadata("BaseClassTypeArguments.java")
            public void testBaseClassTypeArguments() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/BaseClassTypeArguments.java");
            }

            @TestMetadata("Basic.java")
            public void testBasic() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/Basic.java");
            }

            @TestMetadata("Basic_DisabledImprovements.java")
            public void testBasic_DisabledImprovements() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/Basic_DisabledImprovements.java");
            }

            @TestMetadata("Basic_DisabledImprovementsAndReading.java")
            public void testBasic_DisabledImprovementsAndReading() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/Basic_DisabledImprovementsAndReading.java");
            }

            @TestMetadata("Basic_DisabledReading.java")
            public void testBasic_DisabledReading() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/Basic_DisabledReading.java");
            }

            @TestMetadata("ClassTypeParameterBounds.java")
            public void testClassTypeParameterBounds() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/ClassTypeParameterBounds.java");
            }

            @TestMetadata("MethodReceiver.java")
            public void testMethodReceiver() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/MethodReceiver.java");
            }

            @TestMetadata("MethodTypeParameterBounds.java")
            public void testMethodTypeParameterBounds() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/MethodTypeParameterBounds.java");
            }

            @TestMetadata("ReturnType.java")
            public void testReturnType() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/ReturnType.java");
            }

            @TestMetadata("ValueArguments.java")
            public void testValueArguments() throws Exception {
                runTest("compiler/testData/loadJava8/sourceJava/typeUseAnnotations/ValueArguments.java");
            }
        }
    }
}
