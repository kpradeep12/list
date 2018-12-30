# List
List is a command line application to list files and folders in the file system. Its a simple and small CLI application developed using Java with out any dependencies.

List will show files and folders in a user friendly way with many options to customize the output. Below are some of the output formats it will generate:
* Tree (default)
* Table
* Comma separated
* (More formats will be added soon)

## Below are some of features

* Uses **ANSI colors** for colorful output.
* Most of the features of linux **ls** command will be covered.
* (More features will be added soon)

## Development

* Java 11
* ANSI escape codes for coloring
* Run application by executing maven **mvn exec:java -Dexec.mainClass="org.list.Main" -Dexec.args="\<local file system path>"**  

List works on Java 11 and it does not depend on any libraries so it will be simple and faster.