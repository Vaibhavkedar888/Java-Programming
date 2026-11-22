# Custom Library

A simple Java example that demonstrates how to create and use a custom JAR library.

The project has two parts:

1. `CustomLib` contains reusable math methods.
2. `useCustomLib` imports that library and calls the methods from a main program.

## Project Structure

```text
Custom_Library/
|-- CustomLib/
|   |-- src/com/mylib/MathUtils.java
|   |-- bin/com/mylib/MathUtils.class
|   `-- math.jar
`-- useCustomLib/
    |-- src/p1/Main.java
    |-- lib/math.jar
    `-- bin/p1/Main.class
```

## MathUtils Methods

| Method | Description | Example |
|---|---|---|
| `add(a, b)` | Returns the sum | `add(11, 5)` returns `16` |
| `subtract(a, b)` | Returns the difference | `subtract(11, 5)` returns `6` |
| `multiply(a, b)` | Returns the product | `multiply(11, 5)` returns `55` |
| `divide(a, b)` | Returns the quotient | `divide(11, 5)` returns `2.2` |

All methods are `static`, so they can be called without creating a `MathUtils` object.

## Run the Example

Open a terminal in the `Custom_Library` folder.

### Option 1: Run with the existing JAR

```powershell
java -cp "useCustomLib\lib\math.jar;useCustomLib\bin" p1.Main
```

Output:

```text
16
6
55
2.2
```

## Build and Run from Source

### 1. Compile the library

```powershell
javac -d CustomLib\bin CustomLib\src\com\mylib\MathUtils.java
```

### 2. Create the JAR file

```powershell
jar cf CustomLib\math.jar -C CustomLib\bin .
```

Copy the JAR to the application's library folder:

```powershell
Copy-Item CustomLib\math.jar useCustomLib\lib\math.jar
```

### 3. Compile the example application

```powershell
javac -cp "useCustomLib\lib\math.jar" -d useCustomLib\bin useCustomLib\src\p1\Main.java
```

### 4. Run the application

```powershell
java -cp "useCustomLib\lib\math.jar;useCustomLib\bin" p1.Main
```

## How It Works

`MathUtils.java` belongs to the package `com.mylib`. The JAR file is a packaged collection of the compiled library classes.

`Main.java` imports the library methods using static imports:

```java
import static com.mylib.MathUtils.add;
```

The `-cp` option adds the JAR and compiled classes to Java's classpath. Java can then find `com.mylib.MathUtils` and `p1.Main` while compiling or running the program.
