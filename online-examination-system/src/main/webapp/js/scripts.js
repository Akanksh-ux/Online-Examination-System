// JavaScript for handling form submission and table updates

document.getElementById('examForm').addEventListener('submit', async function (e) {
    e.preventDefault(); // Prevent form submission

    const title = document.getElementById('title').value;
    const description = document.getElementById('description').value;
    const startTime = document.getElementById('start_time').value;
    const endTime = document.getElementById('end_time').value;

    // Mock backend API call
    const response = await fetch('/api/exams', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            title: title,
            description: description,
            start_time: startTime,
            end_time: endTime,
            created_by: 1 // Example user ID
        })
    });

    if (response.ok) {
        alert('Exam added successfully!');
        loadExams(); // Refresh the exam list
        e.target.reset(); // Clear the form
    } else {
        alert('Failed to add exam.');
    }
});

// Function to load all exams
async function loadExams() {
    const response = await fetch('/api/exams');
    const exams = await response.json();

    const tableBody = document.getElementById('examTableBody');
    tableBody.innerHTML = ''; // Clear the table

    exams.forEach(exam => {
        const row = document.createElement('tr');
        row.innerHTML = `
            <td>${exam.exam_id}</td>
            <td>${exam.title}</td>
            <td>${exam.description}</td>
            <td>${exam.start_time}</td>
            <td>${exam.end_time}</td>
        `;
        tableBody.appendChild(row);
    });
}

// Load exams on page load
loadExams();
