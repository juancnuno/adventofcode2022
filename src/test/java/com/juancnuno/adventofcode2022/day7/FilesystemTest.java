package com.juancnuno.adventofcode2022.day7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

final class FilesystemTest {
  private final Filesystem filesystem;
  private final Directory root;

  private FilesystemTest() {
    filesystem = new Filesystem("""
        $ cd /
        $ ls
        dir a
        14848514 b.txt
        8504156 c.dat
        dir d
        $ cd a
        $ ls
        dir e
        29116 f
        2557 g
        62596 h.lst
        $ cd e
        $ ls
        584 i
        $ cd ..
        $ cd ..
        $ cd d
        $ ls
        4060174 j
        8033020 d.log
        5626152 d.ext
        7214296 k
        """.lines());

    filesystem.handleLines();
    root = filesystem.getRoot();
  }

  @Test
  void testToString() {
    // Act
    var actual = root.toString();

    // Assert
    var expected = """
        - / (dir)
          - a (dir)
            - e (dir)
              - i (file, size=584)
            - f (file, size=29116)
            - g (file, size=2557)
            - h.lst (file, size=62596)
          - b.txt (file, size=14848514)
          - c.dat (file, size=8504156)
          - d (dir)
            - j (file, size=4060174)
            - d.log (file, size=8033020)
            - d.ext (file, size=5626152)
            - k (file, size=7214296)
          """;

    assertEquals(expected, actual);
  }

  @Test
  void getTotalSize() {
    // Act
    var sum = root.directories()
        .mapToInt(File::getTotalSize)
        .filter(size -> size <= 100_000)
        .sum();

    // Assert
    assertEquals(95_437, sum);
  }
}
