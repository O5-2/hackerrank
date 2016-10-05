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
    line = line[:len(line)-1] 
 }
 lines, _ := strconv.Atoi(line)
 matrix := [][]int{}
 counter1 := 0
 counter2 := lines - 1
 sum1 := 0
 sum2 := 0
 ans := 0
 for i := 0; i < lines; i++ {
    line, _ := bio.ReadString('\n')
    if line[len(line)-1] == '\n' {
       line = line[:len(line)-1]
    }
    current := strings.Split(line, " ")
    appended := []int{}
    for j := 0; j < lines; j++ {
        new_current, _ := strconv.Atoi(current[j])
        appended = append(appended, new_current)
    }
    matrix = append(matrix, appended)
 }
 for i := 0; i < lines; i++ {
    sum1 += matrix[counter1][counter1]
    sum2 += matrix[counter1][counter2]
    counter1 += 1
    counter2 -= 1
 }
 if sum1 - sum2 < 0 {
    ans = sum2 - sum1
 } else if sum1 - sum2 >= 0 {
    ans = sum1 - sum2
 }
 fmt.Printf("%v", ans)
}