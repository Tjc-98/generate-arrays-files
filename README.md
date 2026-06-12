# generate-arrays-files

A Java utility for generating integer arrays and persisting them to plain-text files.

---

## About

Written in Java 11, this project provides three standalone methods for working with integer arrays and flat files. `generateArray` produces a random integer array of a given size, `writeArrayToFile` serializes an array to a comma-separated text file with 10 values per line, and `readArray` parses that file format back into an array. The included file `input1000000BestCase.txt` is a pre-generated sequential array of one million integers produced with these utilities.

## Usage

The methods are static and can be called directly from `Main` or imported into another project.

```java
// Generate a random array of 1 000 000 integers in the range [0, 999999]
int[] arr = Main.generateArray(999999, 1000000);

// Write the array to a file
Main.writeArrayToFile(arr, "output.txt");

// Read it back
int[] loaded = new int[1000000];
Main.readArray(loaded, "output.txt");
```

The output file format is plain text with integers separated by commas and a newline every 10 values.

## Getting Started

### Prerequisites

- Java 21 or later
- Maven 3.8 or later

### Building

**Unix / macOS**
```bash
mvn package
```

**Windows**
```cmd
mvn package
```

### Running

The `main` method contains commented-out example code. Uncomment the relevant block in `src/main/java/Main.java`, then run:

**Unix / macOS**
```bash
mvn exec:java -Dexec.mainClass="Main"
```

**Windows**
```cmd
mvn exec:java -Dexec.mainClass="Main"
```

## Configuration

The array parameters are set directly in the calling code rather than through external configuration. The relevant values to adjust are:

| Constant / Variable | Location | Description |
|---|---|---|
| `arraySize` | `main` method | Number of integers to generate (example uses `1000000`) |
| `maxIntegerSize` | `generateArray` call | Upper bound (inclusive) for random integer values |
| `file` | `writeArrayToFile` / `readArray` calls | Path to the input/output text file |

## License

MIT - see [LICENSE](LICENSE).
