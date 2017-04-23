# text2expr

[![Build Status](https://travis-ci.org/javecs/text2expr.svg?branch=master)](https://travis-ci.org/javecs/text2expr) 
[![codecov](https://codecov.io/gh/javecs/text2expr/branch/master/graph/badge.svg)](https://codecov.io/gh/javecs/text2expr) 
[![Download](https://api.bintray.com/packages/javecs/tools/text2expr/images/download.svg) ](https://bintray.com/javecs/tools/text2expr/_latestVersion)
[![GitHub license](https://img.shields.io/github/license/mashape/apistatus.svg)](https://github.com/javecs/text2expr/blob/master/LICENSE)

テキストを数式に変換し、計算します。

## 使い方

### Gradle

  ```
  repositories {
      maven {
          url  "http://dl.bintray.com/javecs/tools" 
      }
  }

  compile 'xyz.javecs.tools:text2expr:0.0.+'
  ```

### 呼び出し方法 (Kotlin)

  ```
  val value = Text2Expr().eval("3 掛ける 5")
  println(value) // "15" が出力されます。
  ```
  
## 使うもの

- [Kotlin 1.1](https://kotlinlang.org/)
- [expr 0.2.+](https://github.com/javecs/expr/)

