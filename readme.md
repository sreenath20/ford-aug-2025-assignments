IntelliJ Git Workflow – Daily Assignment Submission
✅ With this guide, students have a GitHub-styled, step-by-step IntelliJ workflow for daily assignment submission.


Repository: https://github.com/sreenath20/ford-aug-2025-assignments.git
Tool: IntelliJ IDEA

🛠️ 1. Clone Repository (One-time Setup)

Open IntelliJ IDEA

Navigate → File → New → Project from Version Control

Paste the repository URL:

<repo-url>


Select the local folder → Click Clone

🌿 2. Create & Switch to Your Branch (First-time Only)

Look at the bottom-right Git branch menu in IntelliJ

Click New Branch → name it (e.g., sreenath)

IntelliJ will switch automatically to your branch

Push branch to remote:

VCS → Git → Push

Select "Set upstream" if asked

📂 3. Project Structure

Assignments must follow a consistent folder structure:

src/
└── main/
    └── java/
        └── <your-name>/
            ├── day01-core-java/
            │    └── Assignment1.java
            ├── day02-oops/
            │    └── Assignment2.java
            ├── day03-collections/
            │    └── Assignment3.java
            └── README.md


✅ Rules:

Folder format → dayXX-topic

Class name → AssignmentN.java

Package must match folder, e.g.:

package  <your-name>.day01_core_java;

✍️ 4. Adding Your Assignment (Daily)

Right-click your folder → New → Java Class → name it AssignmentN

Write your code (example for Day 01):

package  <your-name>.day01_core_java;

public class Assignment1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello, Day 01 - Loop Example " + i);
        }
    }
}


Run using the green play button → verify code runs

💾 5. Commit Changes

Open Commit Window → Git → Commit… (Ctrl + K)

Select modified files

Enter a clear commit message

✅ Example:

Added Assignment1 - Java Basics (Day 01)


❌ Avoid: done, final, update

Click Commit (or Commit and Push)

⬆️ 6. Push to Remote

If you only committed:

Go to Git → Push… (Ctrl + Shift + K)

Verify branch = your branch name

Click Push

📝 7. Update README.md

Each student must maintain a README.md in their folder with an assignment tracker.
👉 Use the provided template.

🔄 8. Daily Routine Summary

 Pull latest from your branch (Ctrl + T)

 Create folder & class for the new day

 Run & test your code

 Commit with clear message (Ctrl + K)

 Push to branch (Ctrl + Shift + K)

 Update README.md tracker

⌨️ IntelliJ Shortcut Cheat Sheet
Action	Shortcut (Windows/Linux)	Menu Path
Commit	Ctrl + K	Git → Commit…
Push	Ctrl + Shift + K	Git → Push…
Pull	Ctrl + T	Git → Pull…
Branch	(no shortcut)	Git menu (bottom-right)

