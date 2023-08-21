{"action": "access", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"10\",\"Version\":\"3\",\"Level\":\"4\",\"Task\":\"10\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2020-03-21T21:45:04.9232227Z\"},\"EventRecordID\":\"244867\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"2844\",\"ThreadID\":\"3648\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"MSEDGEWIN10\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\"},{\"Name\":\"UtcTime\",\"text\":\"2020-03-21 21:45:04.906\"},{\"Name\":\"SourceProcessGUID\",\"text\":\"{747f3d96-26fd-5e76-0000-00100a320d01}\"},{\"Name\":\"SourceProcessId\",\"text\":\"8004\"},{\"Name\":\"SourceThreadId\",\"text\":\"108\"},{\"Name\":\"SourceImage\",\"text\":\"C:\\\\Windows\\\\System32\\\\WindowsPowerShell\\\\v1.0\\\\powershell.exe\"},{\"Name\":\"TargetProcessGUID\",\"text\":\"{747f3d96-8ae0-5e76-0000-0010933b8003}\"},{\"Name\":\"TargetProcessId\",\"text\":\"7708\"},{\"Name\":\"TargetImage\",\"text\":\"C:\\\\windows\\\\system32\\\\cmd.exe\"},{\"Name\":\"GrantedAccess\",\"text\":\"0x1fffff\"},{\"Name\":\"CallTrace\",\"text\":\"C:\\\\Windows\\\\SYSTEM32\\\\ntdll.dll+a0fa4|C:\\\\Windows\\\\System32\\\\KERNELBASE.dll+48142|C:\\\\Windows\\\\System32\\\\KERNELBASE.dll+45a1a|C:\\\\Windows\\\\System32\\\\KERNELBASE.dll+455a6|C:\\\\Windows\\\\System32\\\\KERNEL32.DLL+1c153|UNKNOWN(00007FF9A864DCCE)\"}]}}}", "category.generic": "Process", "category.high": "System Management", "category.low": "Manipulation", "datafield5": "108", "datafield9": "C:\\Windows\\SYSTEM32\\ntdll.dll+a0fa4|C:\\Windows\\System32\\KERNELBASE.dll+48142|C:\\Windows\\System32\\KERNELBASE.dll+45a1a|C:\\Windows\\System32\\KERNELBASE.dll+455a6|C:\\Windows\\System32\\KERNEL32.DLL+1c153|UNKNOWN(00007FF9A864DCCE)", "event_src.category": "Other", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_10_Process_access", "importance": "low", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "10", "normalized": true, "object": "process", "object.process.fullpath": "c:\\windows\\system32\\cmd.exe", "object.process.guid": "747f3d96-8ae0-5e76-0000-0010933b8003", "object.process.id": "7708", "object.process.name": "cmd.exe", "object.process.path": "c:\\windows\\system32\\", "object.property": "GrantedAccess", "object.value": "0x1fffff", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-05T13:01:38.206Z", "status": "success", "subject": "process", "subject.process.fullpath": "c:\\windows\\system32\\windowspowershell\\v1.0\\powershell.exe", "subject.process.guid": "747f3d96-26fd-5e76-0000-00100a320d01", "subject.process.id": "8004", "subject.process.name": "powershell.exe", "subject.process.path": "c:\\windows\\system32\\windowspowershell\\v1.0\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2020-03-21T21:45:04.906Z", "type": "raw", "uuid": "887f2297-d82d-4e58-8980-68b9d6e53fc4"}
{"action": "access", "body": "{\"Event\":{\"xmlns\":\"http://schemas.microsoft.com/win/2004/08/events/event\",\"System\":{\"Provider\":{\"Name\":\"Microsoft-Windows-Sysmon\",\"Guid\":\"{5770385f-c22a-43e0-bf4c-06f5698ffbd9}\"},\"EventID\":\"10\",\"Version\":\"3\",\"Level\":\"4\",\"Task\":\"10\",\"Opcode\":\"0\",\"Keywords\":\"0x8000000000000000\",\"TimeCreated\":{\"SystemTime\":\"2020-03-21T21:45:04.9088577Z\"},\"EventRecordID\":\"244865\",\"Correlation\":\"\",\"Execution\":{\"ProcessID\":\"2844\",\"ThreadID\":\"3648\"},\"Channel\":\"Microsoft-Windows-Sysmon/Operational\",\"Computer\":\"MSEDGEWIN10\",\"Security\":{\"UserID\":\"S-1-5-18\"}},\"EventData\":{\"Data\":[{\"Name\":\"RuleName\"},{\"Name\":\"UtcTime\",\"text\":\"2020-03-21 21:45:04.906\"},{\"Name\":\"SourceProcessGUID\",\"text\":\"{747f3d96-26fd-5e76-0000-00100a320d01}\"},{\"Name\":\"SourceProcessId\",\"text\":\"8004\"},{\"Name\":\"SourceThreadId\",\"text\":\"108\"},{\"Name\":\"SourceImage\",\"text\":\"C:\\\\Windows\\\\System32\\\\WindowsPowerShell\\\\v1.0\\\\powershell.exe\"},{\"Name\":\"TargetProcessGUID\",\"text\":\"{747f3d96-06aa-5e76-0000-001046e10400}\"},{\"Name\":\"TargetProcessId\",\"text\":\"4668\"},{\"Name\":\"TargetImage\",\"text\":\"C:\\\\Windows\\\\Explorer.EXE\"},{\"Name\":\"GrantedAccess\",\"text\":\"0x1f3fff\"},{\"Name\":\"CallTrace\",\"text\":\"C:\\\\Windows\\\\SYSTEM32\\\\ntdll.dll+9fc14|C:\\\\Windows\\\\System32\\\\KERNELBASE.dll+20d5e|C:\\\\Windows\\\\assembly\\\\NativeImages_v4.0.30319_64\\\\System\\\\1cccb0a82af13af5a3d3066dbdb9f984\\\\System.ni.dll+381f60|C:\\\\Windows\\\\assembly\\\\NativeImages_v4.0.30319_64\\\\System\\\\1cccb0a82af13af5a3d3066dbdb9f984\\\\System.ni.dll+2fa12e|C:\\\\Windows\\\\assembly\\\\NativeImages_v4.0.30319_64\\\\System\\\\1cccb0a82af13af5a3d3066dbdb9f984\\\\System.ni.dll+2f8cd5|C:\\\\Windows\\\\assembly\\\\NativeImages_v4.0.30319_64\\\\System\\\\1cccb0a82af13af5a3d3066dbdb9f984\\\\System.ni.dll+2c3b1e|C:\\\\Windows\\\\assembly\\\\NativeImages_v4.0.30319_64\\\\System\\\\1cccb0a82af13af5a3d3066dbdb9f984\\\\System.ni.dll+2c01f5|UNKNOWN(00007FF9A864D41C)\"}]}}}", "category.generic": "Process", "category.high": "System Management", "category.low": "Manipulation", "datafield5": "108", "datafield9": "C:\\Windows\\SYSTEM32\\ntdll.dll+9fc14|C:\\Windows\\System32\\KERNELBASE.dll+20d5e|C:\\Windows\\assembly\\NativeImages_v4.0.30319_64\\System\\1cccb0a82af13af5a3d3066dbdb9f984\\System.ni.dll+381f60|C:\\Windows\\assembly\\NativeImages_v4.0.30319_64\\System\\1cccb0a82af13af5a3d3066dbdb9f984\\System.ni.dll+2fa12e|C:\\Windows\\assembly\\NativeImages_v4.0.30319_64\\System\\1cccb0a82af13af5a3d3066dbdb9f984\\System.ni.dll+2f8cd5|C:\\Windows\\assembly\\NativeImages_v4.0.30319_64\\System\\1cccb0a82af13af5a3d3066dbdb9f984\\System.ni.dll+2c3b1e|C:\\Windows\\assembly\\NativeImages_v4.0.30319_64\\System\\1cccb0a82af13af5a3d3066dbdb9f984\\System.ni.dll+2c01f5|UNKNOWN(00007FF9A864D41C)", "event_src.category": "Other", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "generator.type": "logcollector", "generator.version": "N26.0.2936", "id": "PT_Microsoft_Windows_eventlog_Sysmon_10_Process_access", "importance": "low", "input_id": "00000000-0000-0000-0000-000000000000", "mime": "application/x-pt-eventlog", "msgid": "10", "normalized": true, "object": "process", "object.process.fullpath": "c:\\windows\\explorer.exe", "object.process.guid": "747f3d96-06aa-5e76-0000-001046e10400", "object.process.id": "4668", "object.process.name": "explorer.exe", "object.process.path": "c:\\windows\\", "object.property": "GrantedAccess", "object.value": "0x1f3fff", "recv_ipv4": "127.0.0.1", "recv_time": "2023-06-05T13:01:38.206Z", "status": "success", "subject": "process", "subject.process.fullpath": "c:\\windows\\system32\\windowspowershell\\v1.0\\powershell.exe", "subject.process.guid": "747f3d96-26fd-5e76-0000-00100a320d01", "subject.process.id": "8004", "subject.process.name": "powershell.exe", "subject.process.path": "c:\\windows\\system32\\windowspowershell\\v1.0\\", "tag": "some_tag", "task_id": "00000000-0000-0000-0000-000000000000", "taxonomy_version": "26.0.215-release-26.0", "time": "2020-03-21T21:45:04.906Z", "type": "raw", "uuid": "b3953ee7-11bd-4367-a320-00d789a252d2"}

# Тут будет твой тест. В секции expect укажи сколько и каких корреляционных событий ты ожидаешь
expect 1 								{"action": "access", "category.generic": "Attack", "category.high": "Defense Evasion", "category.low": "Access Token Manipulation: Parent PID Spoofing", "correlation_name": "Subrule_ParentPid_Spoofing", "correlation_type": "subrule", "datafield5": "108", "datafield9": "C:\\Windows\\SYSTEM32\\ntdll.dll+a0fa4|C:\\Windows\\System32\\KERNELBASE.dll+48142|C:\\Windows\\System32\\KERNELBASE.dll+45a1a|C:\\Windows\\System32\\KERNELBASE.dll+455a6|C:\\Windows\\System32\\KERNEL32.DLL+1c153|UNKNOWN(00007FF9A864DCCE)", "event_src.category": "Other", "event_src.fqdn": "msedgewin10", "event_src.host": "msedgewin10", "event_src.hostname": "msedgewin10", "event_src.subsys": "Microsoft-Windows-Sysmon/Operational", "event_src.title": "sysmon", "event_src.vendor": "microsoft", "importance": "info", "object": "process", "object.process.fullpath": "c:\\windows\\system32\\cmd.exe", "object.process.guid": "747f3d96-8ae0-5e76-0000-0010933b8003", "object.process.id": "7708", "object.process.name": "cmd.exe", "object.process.parent.fullpath": "c:\\windows\\explorer.exe", "object.process.parent.id": "4668", "object.process.parent.name": "explorer.exe", "object.process.parent.path": "c:\\windows\\", "object.process.path": "c:\\windows\\system32\\", "object.property": "GrantedAccess", "object.value": "0x1fffff|0x1f3fff", "status": "success", "subject": "process", "subject.process.fullpath": "c:\\windows\\system32\\windowspowershell\\v1.0\\powershell.exe", "subject.process.guid": "747f3d96-26fd-5e76-0000-00100a320d01", "subject.process.id": "8004", "subject.process.name": "powershell.exe", "subject.process.path": "c:\\windows\\system32\\windowspowershell\\v1.0\\"}