function sendQuery(sort){
    function sendQuery(sort) {
        // 클릭된 div의 값을 파라미터로 서버에 요청 보냄
        fetch('/api/query', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ sort: sort }) // JSON 형태로 데이터 전달
        })
        .then(response => response.json())
        .then(data => {
            console.log('Query Response:', data);
            // 쿼리 결과를 처리 (예: 화면에 출력 등)
        })
        .catch(error => {
            console.error('Error:', error);
        });
    }
}