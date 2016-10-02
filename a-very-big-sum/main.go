package main

import (
    "fmt"
    "bufio"
    "os"
    "strconv"
    "strings"
)

func main() {
 bio := bufio.NewReader(os.Stdin)
 line, _ := bio.ReadString('\n')
 if line[len(line)-1] == '\n' {
    line = line[:len(line)-1] }
 count, _ := strconv.Atoi(line)
 line, _ = bio.ReadString('\n')
 if line[len(line)-1] == '\n' {
    line = line[:len(line)-1] }
 numbers := strings.Split(line, " ")
 var ans int64
 for i := 0; i < count; i++ {
     current, _ := strconv.Atoi(numbers[i])
     ans += int64(current)
 }
 fmt.Printf("%v", ans)
}